package com.pruebatecnica.bancolombia.service;

import com.pruebatecnica.bancolombia.entities.medico;


import java.util.List;

public interface IMedicoService {
    public List<medico> findAll();

    public medico createMedico(medico crearMedico);

    public medico findById(long id);

    public medico updateMedico( long id, medico datosMedico);

    public void deleteMedico(long id);
}
