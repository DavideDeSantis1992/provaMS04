package com.example.geodNotifApp.webClient;
import com.example.geodNotifApp.dto.DestinatariDTO;
import org.apache.coyote.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.example.geodNotifApp.dto.NotificareDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class GeodDatiAppClient {
    private Logger logger = LoggerFactory.getLogger(GeodDatiAppClient.class);
//    @Autowired
//    private RestTemplate restTemplate;
    /*
    public ResponseEntity<List<NotificareDTO>> listProcessi(){
        ResponseEntity<List<NotificareDTO>> response= null;
        String url ="http://localhost:8085/processo";
        try{
            logger.info("Acquisizione processi");
            response = restTemplate.exchange(url, HttpMethod.POST, null,
                    new ParameterizedTypeReference<List<NotificareDTO>>() {
                    });
            return response;
        } catch (Exception e){
            logger.error("Errore nel recupero dei processi");
            return ResponseEntity.badRequest().build();
        }
    }

    public ResponseEntity<List<DestinatariDTO>> listDestinatari() {
        ResponseEntity<List<DestinatariDTO>> response = null;
        String url = "http://localhost:8085/destinatari";
        try {
            logger.info("Acquisizione destinatari e-mail");
            response = restTemplate.exchange(url, HttpMethod.POST, null,
                    new ParameterizedTypeReference<List<DestinatariDTO>>() {
                    });
            return response;
        } catch (Exception e) {
            logger.error("Errore nel recupero dei destinatari");
            return ResponseEntity.badRequest().build();
        }
    }
     */
    public String listProcessi(){
        String url = "http://localhost:8085/processo";
        logger.info("ho preso l'url:"+url);
        return url + " ho preso questo url dal microservizio client MS5 per prendere il processo";
    }
//    public String listDestinatari(){
//        String url = "http://localhost:8085/destinatari";
//        logger.info("ho preso l'url:"+url);
//        return url + " ho preso questo url dal microservizio client MS5 per prendere i destinatari";
//    }
}
