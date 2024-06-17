package com.example.MS4.service.impl;

import com.example.MS4.dto.EmailDTO;
import com.example.MS4.model.Email;
import com.example.MS4.repository.EmailRepository;
import com.example.MS4.repository.GruppoRepository;
import com.example.MS4.service.EmailService;
import org.springframework.stereotype.Service;

//
//import com.example.MS4.dto.EmailDTO;
//import com.example.MS4.model.Email;
//import com.example.MS4.service.EmailService;
//import org.springframework.stereotype.Service;
//
@Service
public class EmailServiceImpl implements EmailService {

    private final GruppoRepository gruppoRepository;
    private final EmailRepository emailRepository;

    public EmailServiceImpl(GruppoRepository gruppoRepository, EmailRepository emailRepository) {
        this.gruppoRepository = gruppoRepository;
        this.emailRepository = emailRepository;
    }

    @Override
    public void save(EmailDTO emailDTO) {
        Email email = new Email();
        email.setBodyEmail(emailDTO.getBodyEmail());
        email.setIdGruppo(gruppoRepository.findById(emailDTO.getIdGruppo()).orElse(null));
        emailRepository.save(email);
    }
//    private final EmailRepository emailRepository;
//
//    public EmailServiceImpl(EmailRepository emailRepository) {
//        this.emailRepository = emailRepository;
//    }
//    public void save(EmailDTO emailDTO){
//        Email email = new Email();
//        String bodyEmail = "STATO: " + emailDTO.getStato()
//                +"FREQUENZA: " + emailDTO.getFrequenza()
//                +"TIPO: " + emailDTO.getTipo();
//        email.setBodyEmail(bodyEmail);
//        //email.setIdGruppo(1);
//        emailRepository.save(email);
//    }
//}
}