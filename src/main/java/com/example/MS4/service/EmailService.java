package com.example.MS4.service;

import com.example.MS4.dto.EmailDTO;
import com.example.MS4.model.Notificare;
import com.example.MS4.model.Email;

public interface EmailService {

    Email elaborazione(EmailDTO emailDTO);
}
