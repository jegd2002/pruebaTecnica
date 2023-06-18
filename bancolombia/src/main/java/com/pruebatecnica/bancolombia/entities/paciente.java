package com.pruebatecnica.bancolombia.entities;

import javax.persistence.*;
import java.time.LocalDateTime;
@Entity
@Table(name = "paciente")
public class paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_paciente")
    private long idPaciente;
    @Column(name = "nombre_paciente")
    private String nombre;
    @Column(name = "apellido_paciente")
    private String apellido;
    @Column(name = "correo_paciente", unique = true)
    private String correo;
    @Column(name = "password_cliente")
    private String password;
    @Column(name = "telefono_cliente")
    private String telefono;
    @Column(name = "direccion_cliente")
    private String direccion;
    @Column(name = "fecha_creacion")
    private LocalDateTime fechaCreacion;
    @Column(name = "fecha_ultimo_ingreso")
    private LocalDateTime fechaUltimoIngreso;
    @Column(name = "estado")
    private boolean activo;
    @ManyToOne
    @JoinColumn(name = "medico_id")
    private medico medico;

    public paciente(long idPaciente, String nombre, String apellido, String correo, String password, String telefono, String direccion, LocalDateTime fechaCreacion, LocalDateTime fechaUltimoIngreso, boolean activo, com.pruebatecnica.bancolombia.entities.medico medico) {
        this.idPaciente = idPaciente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.password = password;
        this.telefono = telefono;
        this.direccion = direccion;
        this.fechaCreacion = fechaCreacion;
        this.fechaUltimoIngreso = fechaUltimoIngreso;
        this.activo = activo;
        this.medico = medico;
    }

    public paciente() {
    }

    public long getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(long idPaciente) {
        this.idPaciente = idPaciente;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDateTime getFechaUltimoIngreso() {
        return fechaUltimoIngreso;
    }

    public void setFechaUltimoIngreso(LocalDateTime fechaUltimoIngreso) {
        this.fechaUltimoIngreso = fechaUltimoIngreso;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public com.pruebatecnica.bancolombia.entities.medico getMedico() {
        return medico;
    }

    public void setMedico(com.pruebatecnica.bancolombia.entities.medico medico) {
        this.medico = medico;
    }

    @Override
    public String toString() {
        return "paciente{" +
                "idPaciente=" + idPaciente +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", correo='" + correo + '\'' +
                ", password='" + password + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                ", fechaUltimoIngreso=" + fechaUltimoIngreso +
                ", activo=" + activo +
                ", medico=" + medico +
                '}';
    }
}
