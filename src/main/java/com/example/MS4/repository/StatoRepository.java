package com.example.MS4.repository;

import com.example.MS4.model.Stato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatoRepository extends JpaRepository<Stato, Long> {
}
