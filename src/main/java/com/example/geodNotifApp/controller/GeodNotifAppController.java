package com.example.geodNotifApp.controller;

import com.example.geodNotifApp.service.GeodNotifAppService;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GeodNotifAppController {
    @Autowired
    private GeodNotifAppService geodNotifAppService;
    private Logger logger = LoggerFactory.getLogger(GeodNotifAppController.class);
    @PostMapping("/elaborazione")
    public ResponseEntity<Void> elaborazione(){
        try{
            logger.info("Notifica ricevuta");// TODO CHIAMARE SERVICE
            geodNotifAppService.elaborazioneGenerale();
            return ResponseEntity.ok().build();
        }catch(Exception err){
            logger.error(err.getMessage());
            return ResponseEntity.badRequest().build();
        }
    }
}
