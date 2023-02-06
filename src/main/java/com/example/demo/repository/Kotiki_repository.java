package com.example.demo.repository;

import com.example.demo.models.Kotiki_model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Kotiki_repository extends JpaRepository<Kotiki_model,Long> {
    Kotiki_model findByName(String name);
}
