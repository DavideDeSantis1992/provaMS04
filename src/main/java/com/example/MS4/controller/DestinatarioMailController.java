package com.example.MS4.controller;

import com.example.MS4.model.DestinatarioMail;
import com.example.MS4.model.ProvaChiamata;
import com.example.MS4.repository.DestinatarioMailRepository;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

@RestController
public class DestinatarioMailController {
    private final org.slf4j.Logger logger;
    private final RestTemplate restTemplate;

    @Autowired
    private DestinatarioMailRepository destinatarioMailRepository;

    // private Logger logger;

    public DestinatarioMailController() {
        this.restTemplate = new RestTemplate();
        this.logger = LoggerFactory.getLogger(DestinatarioMailController.class);

    }
    @PostMapping("send-data-msx")
    public ResponseEntity<ProvaChiamata> getData(@RequestBody ProvaChiamata provaChiamata) {
        String idIstanzaProcesso = provaChiamata.getIdIstanzaProcesso();
        String stato = provaChiamata.getStato();
        String tipo = provaChiamata.getTipo();
        String frequenza = provaChiamata.getFrequenza();
        logger.info("Ricevuto il seguente messaggio: " + provaChiamata.toString());

        DestinatarioMail destinatarioMail = new DestinatarioMail();
        destinatarioMail.setEmail("idIstanza: "+idIstanzaProcesso +" Stato: "+ stato +" tipo: "+ tipo +" frequenza: "+ frequenza);
        destinatarioMailRepository.save(destinatarioMail);

        return ResponseEntity.ok().body(provaChiamata);
    }

    @PostMapping("send-email")
    public ResponseEntity<String> sendEmail(@RequestBody DestinatarioMail messaggio) {
        ResponseEntity<String> response = null;
        try {
            logger.info("Avvio processo di invio mail");
            String url = "";
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);

            HttpEntity<DestinatarioMail> requestEntity = new HttpEntity<>(messaggio, headers);
            response = restTemplate.exchange(url, HttpMethod.POST, requestEntity, String.class);
            return response.ok(messaggio.toString());

        } catch (Exception err) {
            logger.error("Errore nel invio della mail");
            return response.badRequest().body("Errore nell' invio del messaggio");
        } finally {
            logger.info("Risultato dell' invio");
            System.out.println(messaggio.toString());
        }

    }
}









