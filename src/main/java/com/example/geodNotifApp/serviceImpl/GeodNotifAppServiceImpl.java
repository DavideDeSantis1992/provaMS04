package com.example.geodNotifApp.serviceImpl;
import com.example.geodNotifApp.dto.DestinatariDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.example.geodNotifApp.dto.NotificareDTO;
import com.example.geodNotifApp.service.GeodNotifAppService;
import com.example.geodNotifApp.webClient.GeodDatiAppClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeodNotifAppServiceImpl implements GeodNotifAppService {
    @Value("${bodyEmailSuccesso}")
    private String bodyEmailSuccesso;
    @Value("${oggettoEmailSuccesso}")
    private String oggettoEmailSuccesso;
    @Value("${bodyEmailErrore}")
    private String bodyEmailErrore;
    @Value("${oggettoEmailErrore}")
    private String oggettoEmailErrore;

    @Value("${gruppo1}")
    private List<String> gruppo1;
    @Value("${gruppo2}")
    private List<String> gruppo2;
    @Value("${gruppo3}")
    private List<String> gruppo3;
    @Value("${gruppo4}")
    private List<String> gruppo4;

    private Logger logger = LoggerFactory.getLogger(GeodNotifAppServiceImpl.class);
    @Autowired
    private GeodDatiAppClient geodDatiAppClient;
/*
    private ResponseEntity<List<NotificareDTO>> listaProcessiDaElaborare() {
        try{
            logger.info("chiamo il client");
            ResponseEntity<List<NotificareDTO>> notificareDTO = geodDatiAppClient.listProcessi();
            return notificareDTO;
        }catch(Exception err){
            // TODO inserire i log
            logger.error("chiamata client fallita");
            return ResponseEntity.badRequest().build();
        }
    }
    */
    private String listaProcessiDaElaborare(){
        try{
            logger.info("chiamo il client per prendere i processi da elaborare");
            String url = geodDatiAppClient.listProcessi();
            return url;
        }catch(Exception err){
            // TODO inserire i log
            logger.error("chiamata client fallita");
            return null;
        }
    }
    /*
    private ResponseEntity<List<DestinatariDTO>> listaDestinatariDaElaborare() {
        try{
            logger.info("chiamo il client");
            ResponseEntity<List<DestinatariDTO>> destinatariDTO = geodDatiAppClient.listDestinatari();
            return destinatariDTO;
        }catch(Exception err){
            // TODO inserire i log
            logger.error("chiamata client fallita");
            return ResponseEntity.badRequest().build();
        }
    }
     */
//    private String listaDestinatariDaElaborare(){
//        try{
//            logger.info("chiamo il client per prendere i destinatari da elaborare");
//            String url = geodDatiAppClient.listDestinatari();
//            return url;
//        }catch(Exception err){
//            // TODO inserire i log
//            logger.error("chiamata client fallita");
//            return null;
//        }
//    }

    @Override
    public ResponseEntity<Void> elaborazioneGenerale() {
//        // ho la lista dei processi con i dati dettagliati
       listaProcessiDaElaborare();
//        // ho la lista delle email dei destinatari
//        listaDestinatariDaElaborare();
        generaEmail();
        generaGruppo();
        return null;
    }

    public void generaEmail(){
        String bs = bodyEmailSuccesso;
        String os = oggettoEmailSuccesso;
        String be = bodyEmailErrore;
        String oe = oggettoEmailErrore;
        logger.info("1)bodyEmailSuccesso: "+bs);
        logger.info("2)oggettoEmailSuccesso: "+os);
        logger.info("3)bodyEmailErrore: "+be);
        logger.info("4)oggettoEmailErrore: "+oe);
    }
    public void generaGruppo(){
        logger.info("gruppo1: "+gruppo1);
        logger.info("gruppo2: "+gruppo2);
        logger.info("gruppo3: "+gruppo3);
        logger.info("gruppo4: "+gruppo4);
    }
}
