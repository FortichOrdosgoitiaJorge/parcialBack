package com.parcial.parcialbackend.repository;

import com.parcial.parcialbackend.entity.Facultad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacultadRepository extends JpaRepository<Facultad, Long> {
}