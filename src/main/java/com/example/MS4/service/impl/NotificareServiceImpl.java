package com.example.MS4.service.impl;

import com.example.MS4.dto.NotificareDTO;
import com.example.MS4.model.Notificare;
import com.example.MS4.repository.*;
import com.example.MS4.service.NotificareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificareServiceImpl implements NotificareService {
    @Autowired
    private NotificareRepository notificareRepository;
    @Autowired
    private TipoRepository tipoRepository;
    @Autowired
    private FrequenzaRepository frequenzaRepository;
    @Autowired
    private StatoRepository statoRepository;
    @Autowired
    private StatoNotificaRepository statoNotificaRepository;

    @Override
    public void saveNotificare(NotificareDTO notificareDTO) {
        Notificare notificare = new Notificare();
        notificare.setIdIstanzaProcesso(notificareDTO.getIdIstanzaProcesso());
        notificare.setIdTipo(tipoRepository.findById(notificareDTO.getIdTipo()).orElse(null));
        notificare.setIdFrequenza(frequenzaRepository.findById(notificareDTO.getIdFrequenza()).orElse(null));
        notificare.setIdStato(statoRepository.findById(notificareDTO.getIdStato()).orElse(null));
        notificare.setIdStatoNotifica(statoNotificaRepository.findById(notificareDTO.getIdStatoNotifica()).orElse(null));
        notificareRepository.save(notificare);
    }
}
