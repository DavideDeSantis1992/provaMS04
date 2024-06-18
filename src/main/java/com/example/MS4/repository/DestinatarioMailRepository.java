package com.example.MS4.repository;

import com.example.MS4.model.DestinatarioMail;
import com.example.MS4.model.GruppoNotifica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DestinatarioMailRepository extends JpaRepository<DestinatarioMail, Long> {
    List<DestinatarioMail> findByIdGruppoNotificaAndFlagCc(GruppoNotifica gruppo, boolean flagCc);

}
