package com.pruebatecnica.bancolombia.service;

import com.pruebatecnica.bancolombia.entities.idRol;


import java.util.List;

public interface IidRolService {
    public List<idRol> findAll();

    public idRol createId(idRol crearId);

    public idRol findById(long id);

    public idRol updateId( long id, idRol datosId);

    public void deleteID(long id);
}
