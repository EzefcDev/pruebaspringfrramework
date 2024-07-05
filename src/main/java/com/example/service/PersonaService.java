package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.example.modelo.Persona;
import com.example.repository.PersonaRepository;

@Service
public class PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    @Scheduled(cron = "0 */1 * * * *")
    public void fetchPersonas() {
        List<Persona> personas = personaRepository.findAll();
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }

    public void addPersona(){

        Persona persona = new Persona();
        persona.setNombre("Juan");
        persona.setApellido("Pérez");

        personaRepository.save(persona);
    }
}
