package com.example.MS4.service;

import com.example.MS4.dto.EmailDTO;
import org.springframework.stereotype.Service;

@Service
public interface EmailService {

    public void save(EmailDTO emailDTO);

}
