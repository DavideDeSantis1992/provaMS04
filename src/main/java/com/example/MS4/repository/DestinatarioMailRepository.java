package com.example.MS4.repository;

import com.example.MS4.model.DestinatarioMail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DestinatarioMailRepository extends JpaRepository<DestinatarioMail, Long> {
}
