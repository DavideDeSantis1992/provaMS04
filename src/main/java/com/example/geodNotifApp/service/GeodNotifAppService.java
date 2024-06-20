package com.example.geodNotifApp.service;

import com.example.geodNotifApp.dto.DestinatariDTO;
import com.example.geodNotifApp.dto.NotificareDTO;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface GeodNotifAppService {

    ResponseEntity<Void> elaborazioneGenerale();
}
