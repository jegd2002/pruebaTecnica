package com.pruebatecnica.bancolombia.service;

import com.pruebatecnica.bancolombia.entities.cita;
import com.pruebatecnica.bancolombia.entities.paciente;
import com.pruebatecnica.bancolombia.repository.ICitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class citaService implements ICitaService{

    @Autowired
    public ICitaRepository citaRepository;
    @Override
    public List<cita> findAll() {
        List<cita> listaCita = (List<cita>) citaRepository.findAll();
        return listaCita;
    }

    @Override
    public cita createCita(cita crearCita) {
        cita newCita = citaRepository.save(crearCita);
        return newCita;
    }

    @Override
    public cita findById(long id) {
        Optional<cita> findIdCita = citaRepository.findById(id);
        return findIdCita.get();
    }

    @Override
    public cita updateCita(long id, cita datosCita) {
        cita updateCita = citaRepository.save(datosCita);
        return  updateCita;
    }

    @Override
    public void deleteCita(long id) {
        citaRepository.deleteById(id);
    }
}
