package com.example.MS4.repository;

import com.example.MS4.model.DB4Log;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DB4LogRepository extends JpaRepository<DB4Log, Long> {
}
