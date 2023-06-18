package com.pruebatecnica.bancolombia.entities;

import javax.persistence.*;

@Entity
@Table(name = "medico")
public class medico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_medico")
    private long idMedico;
    @Column(name = "nombre_medico")
    private String nombre;
    @Column(name = "apellido_medico")
    private String apellido;
    @Column(name = "correo_medico",unique = true)
    private String correo;
    @Column(name = "password_medico")
    private String password;
    @Column(name = "estado_medico")
    private boolean estado;

    public medico(long idMedico, String nombre, String apellido, String correo, String password, boolean estado) {
        this.idMedico = idMedico;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.password = password;
        this.estado = estado;
    }

    public medico() {
    }

    public long getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(long idMedico) {
        this.idMedico = idMedico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



}
