package com.example.MS4.service.impl;

import com.example.MS4.model.ChiamataPostman;
import com.example.MS4.model.EmailCorpo;
import com.example.MS4.model.GruppoNotifica;
import com.example.MS4.repository.EmailCorpoRepository;
import com.example.MS4.repository.GruppoNotificaRepository;
import com.example.MS4.service.EmailCorpoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailCorpoServiceImpl implements EmailCorpoService {

    @Autowired
    private EmailCorpoRepository emailCorpoRepository;

    @Autowired
    private GruppoNotificaRepository gruppoNotificaRepository;



    @Override
    public EmailCorpo elaborazione(ChiamataPostman chiamataPostman) {

        String idIstanzaProcesso = chiamataPostman.getIdIstanzaProcesso();
        String stato = chiamataPostman.getStato().toLowerCase();
        String tipo = chiamataPostman.getTipo().toLowerCase();
        String frequenza = chiamataPostman.getFrequenza().toLowerCase();

        Long gruppo = null;

        if (tipo.equals("malattia") && frequenza.equals("mensile")) {
            gruppo =1L;
        } else if (tipo.equals("malattia") && frequenza.equals("trimestrale")) {
            gruppo = 2L;
        } else if (tipo.equals("infortunio") && frequenza.equals("mensile")) {
            gruppo = 3L;
        } else if (tipo.equals("infortunio") && frequenza.equals("semestrale")) {
            gruppo = 4L;
        }

        GruppoNotifica gruppoNotifica = gruppoNotificaRepository.findByIdGruppoNotifica(gruppo);


        EmailCorpo nuovoCorpoEmail = new EmailCorpo();

        nuovoCorpoEmail.setBodyEmail("E' stata inviata una notifica al gruppo "
                + gruppo + " per l'istanza: " + idIstanzaProcesso +
                ", con stato: " + stato + ", tipo: " + tipo
                + ", frequenza: " + frequenza);

        nuovoCorpoEmail.setIdGruppoNotifica(gruppoNotifica);




        emailCorpoRepository.save(nuovoCorpoEmail);
        System.out.println(nuovoCorpoEmail);

        return nuovoCorpoEmail;
    }
}
