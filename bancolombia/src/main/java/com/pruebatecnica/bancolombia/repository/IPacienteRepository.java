package com.pruebatecnica.bancolombia.repository;

import com.pruebatecnica.bancolombia.entities.paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPacienteRepository extends JpaRepository<paciente, Long> {
}
