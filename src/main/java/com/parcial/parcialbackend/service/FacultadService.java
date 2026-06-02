package com.parcial.parcialbackend.service;

import com.parcial.parcialbackend.entity.Facultad;
import com.parcial.parcialbackend.repository.FacultadRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FacultadService {

    private final FacultadRepository facultadRepository;

    public FacultadService(FacultadRepository facultadRepository) {
        this.facultadRepository = facultadRepository;
    }

    public List<Facultad> getAll() {
        return facultadRepository.findAll();
    }

    public Optional<Facultad> getById(Long id) {
        return facultadRepository.findById(id);
    }

    public Facultad create(Facultad facultad) {
        return facultadRepository.save(facultad);
    }

    public Facultad update(Long id, Facultad facultad) {
        Facultad existing = facultadRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Facultad no encontrada"));
        existing.setNombre(facultad.getNombre());
        existing.setDecano(facultad.getDecano());
        existing.setUbicacion(facultad.getUbicacion());
        return facultadRepository.save(existing);
    }

    public void delete(Long id) {
        facultadRepository.deleteById(id);
    }
}