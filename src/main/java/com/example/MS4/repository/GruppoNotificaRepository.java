package com.example.MS4.repository;

import com.example.MS4.model.GruppoNotifica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GruppoNotificaRepository extends JpaRepository<GruppoNotifica, Long> {
    GruppoNotifica findByIdGruppoNotifica(Long idGruppoNotifica);








}
