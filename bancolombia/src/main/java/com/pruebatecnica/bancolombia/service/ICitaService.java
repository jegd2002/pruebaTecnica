package com.pruebatecnica.bancolombia.service;

import com.pruebatecnica.bancolombia.entities.cita;


import java.util.List;

public interface ICitaService {
    public List<cita> findAll();

    public cita createCita(cita crearCita);

    public cita findById(long id);

    public cita updateCita( long id, cita datosCita);

    public void deleteCita(long id);
}
