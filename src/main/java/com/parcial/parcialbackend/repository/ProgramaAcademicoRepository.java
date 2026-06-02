package com.parcial.parcialbackend.repository;

import com.parcial.parcialbackend.entity.ProgramaAcademico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgramaAcademicoRepository extends JpaRepository<ProgramaAcademico, Long> {
}