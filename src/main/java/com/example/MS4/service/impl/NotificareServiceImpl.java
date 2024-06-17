package com.example.MS4.service.impl;

import com.example.MS4.dto.NotificareDTO;
import com.example.MS4.model.Notificare;
import com.example.MS4.repository.*;
import com.example.MS4.service.NotificareService;
import org.springframework.stereotype.Service;

@Service
public class NotificareServiceImpl implements NotificareService {

    private final NotificareRepository notificareRepository;
    private final TipoCDRepository tcRepository;
    private final FrequenzaCDRepository frequenzaCDRepository;
    private final StatoRepository statoRepository;
    private final StatoNotificaRepository statoNotificaRepository;

    public NotificareServiceImpl(NotificareRepository notificareRepository, TipoCDRepository tcRepository, FrequenzaCDRepository frequenzaCDRepository, StatoRepository statoRepository, StatoNotificaRepository statoNotificaRepository) {
        this.notificareRepository = notificareRepository;
        this.tcRepository = tcRepository;
        this.frequenzaCDRepository = frequenzaCDRepository;
        this.statoRepository = statoRepository;
        this.statoNotificaRepository = statoNotificaRepository;
    }

    @Override
    public void saveNotificare(NotificareDTO notificareDTO) {
        Notificare notificare = new Notificare();
        notificare.setIdIstanzaProcesso(notificareDTO.getIdIstanzaProcesso());
        notificare.setIdTipoCD(tcRepository.findById(notificareDTO.getIdTipoCD()).orElse(null));
        notificare.setIdFrequenzaCD(frequenzaCDRepository.findById(notificareDTO.getIdFrequenzaCD()).orElse(null));
        notificare.setIdStato(statoRepository.findById(notificareDTO.getIdStato()).orElse(null));
        notificare.setIdStatoNotifica(statoNotificaRepository.findById(notificareDTO.getIdStatoNotifica()).orElse(null));
        notificareRepository.save(notificare);
    }
}
