package com.example.MS4.service.impl;
import com.example.MS4.model.ChiamataPostman;
import com.example.MS4.model.DestinatarioMail;
import com.example.MS4.model.EmailCorpo;
import com.example.MS4.model.GruppoNotifica;
import com.example.MS4.repository.DestinatarioMailRepository;
import com.example.MS4.repository.EmailCorpoRepository;
import com.example.MS4.repository.GruppoNotificaRepository;
import com.example.MS4.service.EmailCorpoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class EmailCorpoServiceImpl implements EmailCorpoService {
    @Autowired
    private EmailCorpoRepository emailCorpoRepository;
    @Autowired
    private GruppoNotificaRepository gruppoNotificaRepository;
    @Autowired
    private JavaMailSender javaMailSender;
    @Autowired
    private DestinatarioMailRepository destinatarioMailRepository;
    @Override
    public EmailCorpo elaborazione(ChiamataPostman chiamataPostman) {
        String idIstanzaProcesso = chiamataPostman.getIdIstanzaProcesso();
        String stato = chiamataPostman.getStato().toLowerCase();
        String tipo = chiamataPostman.getTipo().toLowerCase();
        String frequenza = chiamataPostman.getFrequenza().toLowerCase();
        String parametro = tipo+" "+frequenza;
        GruppoNotifica gruppoNotificaFind = gruppoNotificaRepository.findByDescrizione(parametro);
        Long gruppo = gruppoNotificaFind.getIdGruppoNotifica();
        GruppoNotifica gruppoNotifica = gruppoNotificaRepository.findByIdGruppoNotifica(gruppo);
        EmailCorpo nuovoCorpoEmail = new EmailCorpo();
        nuovoCorpoEmail.setBodyEmail("E' stata inviata una notifica al gruppo "
                + gruppo + " per l'istanza: " + idIstanzaProcesso +
                ", con stato: " + stato + ", tipo: " + tipo
                + ", frequenza: " + frequenza);
        System.out.println(nuovoCorpoEmail.getBodyEmail().toString());
        nuovoCorpoEmail.setIdGruppoNotifica(gruppoNotifica);
        GruppoNotifica gruppoNotificaDestinatari = gruppoNotificaRepository.findById(gruppo).orElse(null);
        List<DestinatarioMail> destinatariPrincipali = destinatarioMailRepository.findByIdGruppoNotificaAndFlagCc(gruppoNotificaDestinatari, false);
        String[] to = destinatariPrincipali.stream()
                .map(DestinatarioMail::getEmail)
                .toArray(String[]::new);
        GruppoNotifica gruppoNotificaDestinatariCc = gruppoNotificaRepository.findById(gruppo).orElse(null);
        List<DestinatarioMail> destinatariCc = destinatarioMailRepository.findByIdGruppoNotificaAndFlagCc(gruppoNotificaDestinatariCc, true);
        String[] cc = destinatariCc.stream()
                .map(DestinatarioMail::getEmail)
                .toArray(String[]::new);
        String oggetto = "Notifica di completamento processo con esito: "+stato
                ;
        String corpo = nuovoCorpoEmail.getBodyEmail().toString();
        System.out.println("IN NOTIFICA");
        try {
            Thread.sleep(8000); // 20 secondi
            sendSimpleEmail(to, cc, oggetto, corpo);
            System.out.println("NOTIFICATO");
            emailCorpoRepository.save(nuovoCorpoEmail);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Errore durante l'attesa: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Errore durante l'invio dell'email o il salvataggio dell'oggetto: " + e.getMessage());
        }
        return nuovoCorpoEmail;
    }
    private void sendSimpleEmail(String[] to, String[] cc, String oggetto, String corpo) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(to);
        if (cc != null && cc.length > 0) {
            message.setCc(cc);
        }
        message.setSubject(oggetto);
        message.setText(corpo);
        message.setFrom("davidedesantis1992@gmail.com"); // Assicurati di impostare il mittente corretto
        try {
            javaMailSender.send(message);
            System.out.println("Email inviata con successo a "
                    + String.join(", ", to) +" "+ String.join(", ", cc));
        } catch (Exception e) {
            System.err.println("Errore durante l'invio dell'email: " + e.getMessage());
        }
    }
}
