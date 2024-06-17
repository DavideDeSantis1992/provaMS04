package com.example.MS4.controller;

import com.example.MS4.dto.EmailDTO;
import com.example.MS4.model.Email;
import com.example.MS4.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {
    @Autowired
    private EmailService emailService;
    @PostMapping("/emailcorpo")
    public ResponseEntity<Email> elaborazione(@RequestBody EmailDTO emailDTO) {
        Email nuovoCorpoEmail = emailService.elaborazione(emailDTO);
        return ResponseEntity.ok(nuovoCorpoEmail);
    }

}









