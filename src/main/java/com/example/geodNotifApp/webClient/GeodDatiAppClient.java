package com.example.geodNotifApp.webClient;
import com.example.geodNotifApp.dto.DestinatariDTO;
import com.example.geodNotifApp.entita.Frequenza;
import com.example.geodNotifApp.entita.Tipo;
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
    public List<NotificareDTO> listaProcessi(){
        String url = "http://localhost:8085/processo";
        logger.info("ho preso l'url:"+url);
        // TODO creo i vari TIPI
        Tipo infortunio = new Tipo();
        infortunio.setId("1");
        infortunio.setDescrizione("infortunio");

        Tipo malattia = new Tipo();
        malattia.setId("2");
        malattia.setDescrizione("malattia");
        // TODO creo le varie FREQUENZE

        Frequenza mensile = new Frequenza();
        mensile.setId("1");
        mensile.setDescrizione("mensile");

        Frequenza semestrale = new Frequenza();
        semestrale.setId("2");
        semestrale.setDescrizione("semestrale");


        // TODO creo nuovi processi di NotificareDTO
        NotificareDTO processo1 = new NotificareDTO();
        processo1.setIdIstanzaProcesso("1");
        processo1.setIdTipoCd(infortunio);
        processo1.setIdFrequenzaCd(mensile);
        processo1.setIdStatoArtifact(null);
        processo1.setIdStatoNotifica(null);

        NotificareDTO processo2 = new NotificareDTO();
        processo2.setIdIstanzaProcesso("2");
        processo2.setIdTipoCd(malattia);
        processo2.setIdFrequenzaCd(semestrale);
        processo2.setIdStatoArtifact(null);
        processo2.setIdStatoNotifica(null);

        List<NotificareDTO> listaProcessiDTO = List.of(processo1, processo2);
        logger.info("ho preso la lista dei processi dall'endpoint: "+listaProcessiDTO);

        return listaProcessiDTO;
    }


//    public String listDestinatari(){
//        String url = "http://localhost:8085/destinatari";
//        logger.info("ho preso l'url:"+url);
//        return url + " ho preso questo url dal microservizio client MS5 per prendere i destinatari";
//    }
}
