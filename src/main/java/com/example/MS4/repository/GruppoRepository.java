package com.example.MS4.repository;

import com.example.MS4.model.Gruppo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GruppoRepository extends JpaRepository<Gruppo, Long> {
}
