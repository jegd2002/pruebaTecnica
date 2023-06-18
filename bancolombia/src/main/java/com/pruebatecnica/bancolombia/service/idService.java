package com.pruebatecnica.bancolombia.service;

import com.pruebatecnica.bancolombia.entities.idRol;
import com.pruebatecnica.bancolombia.entities.paciente;
import com.pruebatecnica.bancolombia.repository.IidRolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class idService implements IidRolService{

    @Autowired
    public IidRolRepository rolRepository;
    @Override
    public List<idRol> findAll() {
        List<idRol> listaRol = (List<idRol>) rolRepository.findAll();
        return listaRol;
    }

    @Override
    public idRol createId(idRol crearId) {
        idRol crearRol = rolRepository.save(crearId);
        return crearRol;
    }

    @Override
    public idRol findById(long id) {
        Optional<idRol> findIdRol = rolRepository.findById(id);
        return findIdRol.get();
    }

    @Override
    public idRol updateId(long id, idRol datosId) {
        idRol updateIdRol = rolRepository.save(datosId);
        return  updateIdRol;
    }

    @Override
    public void deleteID(long id) {
        rolRepository.deleteById(id);
    }
}
