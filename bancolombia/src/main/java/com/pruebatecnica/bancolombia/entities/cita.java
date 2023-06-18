package com.pruebatecnica.bancolombia.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name = "cita")
public class cita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cita")
    private long idCita;
    @Column(name = "fecha_cita")
    private LocalDate fecha;
    @Column(name = "hora_cita")
    private LocalTime hora;
    @ManyToOne
    @JoinColumn(name = "cita_paciente")
    private paciente paciente;
    @ManyToOne
    @JoinColumn(name = "asignacion_medico")
    private medico medico;

    public cita(long idCita, LocalDate fecha, LocalTime hora, com.pruebatecnica.bancolombia.entities.paciente paciente, com.pruebatecnica.bancolombia.entities.medico medico) {
        this.idCita = idCita;
        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente;
        this.medico = medico;
    }

    public cita() {
    }

    public long getIdCita() {
        return idCita;
    }

    public void setIdCita(long idCita) {
        this.idCita = idCita;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public com.pruebatecnica.bancolombia.entities.paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(com.pruebatecnica.bancolombia.entities.paciente paciente) {
        this.paciente = paciente;
    }

    public com.pruebatecnica.bancolombia.entities.medico getMedico() {
        return medico;
    }

    public void setMedico(com.pruebatecnica.bancolombia.entities.medico medico) {
        this.medico = medico;
    }
}
