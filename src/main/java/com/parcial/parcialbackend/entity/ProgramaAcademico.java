package com.parcial.parcialbackend.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "programas_academicos")
@Data
@NoArgsConstructor
public class ProgramaAcademico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String nivel;
    private Integer duracionSemestres;

    @ManyToOne
    @JoinColumn(name = "facultad_id")
    private Facultad facultad;
}