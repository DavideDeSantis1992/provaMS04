package com.example.MS4.service.impl;

import com.example.MS4.dto.EmailDTO;
import com.example.MS4.model.Notificare;
import com.example.MS4.model.Email;
import com.example.MS4.model.Gruppo;
import com.example.MS4.repository.EmailRepository;
import com.example.MS4.repository.GruppoRepository;
import com.example.MS4.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService {
    @Autowired
    private EmailRepository emailRepository;
    @Autowired
    private GruppoRepository gruppoRepository;
    @Override
    public Email elaborazione(EmailDTO emailDTO) {
        Email email = new Email();
        email.setBodyEmail(email.getBodyEmail());
        email.setIdGruppo(gruppoRepository.findById(emailDTO.getIdGruppo()).orElse(null));
        return emailRepository.save(email);
    }
}
