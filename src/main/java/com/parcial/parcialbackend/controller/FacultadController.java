package com.parcial.parcialbackend.controller;

import com.parcial.parcialbackend.entity.Facultad;
import com.parcial.parcialbackend.service.FacultadService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/facultades")
@CrossOrigin(origins = "*")
public class FacultadController {

    private final FacultadService facultadService;

    public FacultadController(FacultadService facultadService) {
        this.facultadService = facultadService;
    }

    @GetMapping
    public List<Facultad> getAll() {
        return facultadService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Facultad> getById(@PathVariable Long id) {
        return facultadService.getById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Facultad create(@RequestBody Facultad facultad) {
        return facultadService.create(facultad);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Facultad> update(@PathVariable Long id, @RequestBody Facultad facultad) {
        return facultadService.getById(id)
                .map(existing -> ResponseEntity.ok(facultadService.update(id, facultad)))
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        facultadService.delete(id);
        return ResponseEntity.noContent().build();
    }
}