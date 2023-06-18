package com.pruebatecnica.bancolombia.entities;

import javax.persistence.*;

@Entity
@Table(name = "id_rol")
public class idRol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rol", nullable = false)
    private long idRol;
    @Column(name = "descripcion", nullable = false)
    private String descripcion;
    @Column(name = "estado")
    private boolean estado;

    public idRol(long idRol, String descripcion, boolean estado) {
        this.idRol = idRol;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public idRol() {
    }

    public long getIdRol() {
        return idRol;
    }

    public void setIdRol(long idRol) {
        this.idRol = idRol;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "idRol{" +
                "idRol=" + idRol +
                ", descripcion='" + descripcion + '\'' +
                ", estado=" + estado +
                '}';
    }
}
