package com.pruebatecnica.bancolombia.service;

import com.pruebatecnica.bancolombia.entities.medico;


import com.pruebatecnica.bancolombia.entities.paciente;
import com.pruebatecnica.bancolombia.repository.IMedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class medicoService implements IMedicoService{

    @Autowired
    public IMedicoRepository medicoRepository;
    @Override
    public List<medico> findAll() {
        List<medico> medico = (List<medico>) medicoRepository.findAll();
        return medico;
    }

    @Override
    public medico createMedico(medico crearMedico) {
        medico newMedico = medicoRepository.save(crearMedico);
        return newMedico;
    }

    @Override
    public medico findById(long id) {
        Optional<medico> findIdMedico = medicoRepository.findById(id);
        return findIdMedico.get();
    }

    @Override
    public medico updateMedico(long id, medico datosMedico) {
        medico updateMedico = medicoRepository.save(datosMedico);
        return  updateMedico;
    }

    @Override
    public void deleteMedico(long id) {
        medicoRepository.deleteById(id);
    }
}
