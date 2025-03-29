package com.unisabana.edu.co.telemedicina.medicamentos;

import java.time.LocalDate;

public class MedicationOrder {

    private Long id;
    private String cedulaPaciente;
    private String medicamento;
    private int cantidad;
    private String indicaciones;
    private LocalDate fechaOrden;

    public MedicationOrder(Long id, String cedulaPaciente, String medicamento, int cantidad, String indicaciones, LocalDate fechaOrden) {
        this.id = id;
        this.cedulaPaciente = cedulaPaciente;
        this.medicamento = medicamento;
        this.cantidad = cantidad;
        this.indicaciones = indicaciones;
        this.fechaOrden = fechaOrden;
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

    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getIndicaciones() {
        return indicaciones;
    }

    public void setIndicaciones(String indicaciones) {
        this.indicaciones = indicaciones;
    }

    public LocalDate getFechaOrden() {
        return fechaOrden;
    }

    public void setFechaOrden(LocalDate fechaOrden) {
        this.fechaOrden = fechaOrden;
    }
}