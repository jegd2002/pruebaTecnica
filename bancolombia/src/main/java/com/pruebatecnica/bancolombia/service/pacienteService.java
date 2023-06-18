package com.pruebatecnica.bancolombia.service;

import com.pruebatecnica.bancolombia.entities.paciente;
import com.pruebatecnica.bancolombia.repository.IPacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class pacienteService implements IPacienteService{

    @Autowired
    public IPacienteRepository pacienteRepository;
    @Override
    public List<paciente> findAll3() {
        List<paciente> paciente = (List<paciente>) pacienteRepository.findAll();
        return paciente;
    }

    @Override
    public paciente createPaciente(paciente crearPaciente) {
        paciente newPaciente = pacienteRepository.save(crearPaciente);
        return newPaciente;
    }

    @Override
    public paciente findById(long id) {
        Optional<paciente> findIdPaciente = pacienteRepository.findById(id);
        return findIdPaciente.get();
    }

    @Override
    public paciente updatePaciente(long id, paciente datosPaciente) {
        paciente updatePaciente = pacienteRepository.save(datosPaciente);
        return  updatePaciente;
    }

    @Override
    public void deletePaciente(long id) {
        pacienteRepository.deleteById(id);
    }
}
