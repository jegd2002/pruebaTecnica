package com.pruebatecnica.bancolombia.service;

import com.pruebatecnica.bancolombia.entities.paciente;

import java.util.List;

public interface IPacienteService {
    public List<paciente> findAll3();

    public paciente createPaciente(paciente crearPaciente);

    public paciente findById(long id);

    public paciente updatePaciente( long id, paciente datosPaciente);

    public void deletePaciente(long id);
}
