package com.example.MS4.repository;

import com.example.MS4.model.FrequenzaCD;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FrequenzaCDRepository extends JpaRepository<FrequenzaCD, Long> {
}
