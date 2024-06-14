package com.example.MS4.controller;


import com.example.MS4.model.ChiamataPostman;
import com.example.MS4.model.EmailCorpo;
import com.example.MS4.repository.EmailCorpoRepository;
import com.example.MS4.service.EmailCorpoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailCorpoController {

    @Autowired
    private EmailCorpoService emailCorpoService;

    @PostMapping("/emailcorpo")
    public ResponseEntity<EmailCorpo> elaborazione(@RequestBody ChiamataPostman chiamataPostman) {

        EmailCorpo nuovoCorpoEmail = emailCorpoService.elaborazione(chiamataPostman);
        return ResponseEntity.ok(nuovoCorpoEmail);
    }

}









