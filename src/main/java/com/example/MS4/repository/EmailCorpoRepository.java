package com.example.MS4.repository;

import com.example.MS4.model.EmailCorpo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailCorpoRepository extends JpaRepository<EmailCorpo, Long> {
}
