package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.modelo.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona,Long> {

} 
