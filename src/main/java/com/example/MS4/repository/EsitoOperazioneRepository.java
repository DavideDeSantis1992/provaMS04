package com.example.MS4.repository;

import com.example.MS4.model.EsitoOperazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EsitoOperazioneRepository extends JpaRepository<EsitoOperazione, Long> {
}
