package com.example.MS4.repository;

import com.example.MS4.model.StatoNotifica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatoNotificaRepository extends JpaRepository<StatoNotifica,Long> {
}
