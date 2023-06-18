package com.pruebatecnica.bancolombia.repository;

import com.pruebatecnica.bancolombia.entities.cita;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICitaRepository extends JpaRepository<cita, Long> {
}
