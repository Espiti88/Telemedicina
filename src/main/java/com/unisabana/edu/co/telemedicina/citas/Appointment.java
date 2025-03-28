package com.unisabana.edu.co.telemedicina.citas;

import java.time.LocalDateTime;

public class Appointment {

    private Long id;
    private String cedulaPaciente;
    private LocalDateTime fechaHora;
    private boolean estado; // Nuevo atributo

    public Appointment(Long id, String cedulaPaciente, LocalDateTime fechaHora, boolean estado) {
        this.id = id;
        this.cedulaPaciente = cedulaPaciente;
        this.fechaHora = fechaHora;
        this.estado = estado;
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

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}