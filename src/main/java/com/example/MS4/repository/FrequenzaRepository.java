package com.example.MS4.repository;

import com.example.MS4.model.Frequenza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FrequenzaRepository extends JpaRepository<Frequenza, Long> {
}
