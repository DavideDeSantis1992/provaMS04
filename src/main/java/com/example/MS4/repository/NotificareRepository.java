package com.example.MS4.repository;

import com.example.MS4.model.Notificare;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificareRepository extends JpaRepository<Notificare, Long> {
}
