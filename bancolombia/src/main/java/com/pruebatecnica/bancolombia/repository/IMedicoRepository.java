package com.pruebatecnica.bancolombia.repository;

import com.pruebatecnica.bancolombia.entities.medico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMedicoRepository extends JpaRepository<medico, Long> {
}
