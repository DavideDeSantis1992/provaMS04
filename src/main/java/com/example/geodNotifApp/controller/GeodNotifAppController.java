package com.example.geodNotifApp.controller;

import com.example.geodNotifApp.service.NotificareService;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GeodNotifAppController {
    @Autowired
    private NotificareService notificareService;
    private Logger logger = LoggerFactory.getLogger(GeodNotifAppController.class);
    @PostMapping("/notificare")
    public ResponseEntity<Void> elaborazione(){
        try{
            logger.info("Notifica ricevuta");// TODO CHIAMARE SERVICE
            notificareService.elaborazioneGenerale();
            return ResponseEntity.ok().build();
        }catch(Exception err){
            logger.error(err.getMessage());
            return ResponseEntity.badRequest().build();
        }
    }
}
