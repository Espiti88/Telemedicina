package com.unisabana.edu.co.telemedicina.tratamientos;

import java.time.LocalDate;

public class Treatment {

    private Long id;
    private String cedulaPaciente;
    private String descripcion;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    public Treatment(Long id, String cedulaPaciente, String descripcion, LocalDate fechaInicio, LocalDate fechaFin) {
        this.id = id;
        this.cedulaPaciente = cedulaPaciente;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCedulaPaciente() {
        return cedulaPaciente;
    }

    public void setCedulaPaciente(String cedulaPaciente) {
        this.cedulaPaciente = cedulaPaciente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }
}
