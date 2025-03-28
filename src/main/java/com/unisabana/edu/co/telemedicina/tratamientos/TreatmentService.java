package com.unisabana.edu.co.telemedicina.tratamientos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class TreatmentService {

    @Autowired
    private TreatmentRepository treatmentRepository;

    public Treatment createTreatment(String cedulaPaciente, String descripcion, LocalDate fechaInicio, LocalDate fechaFin) {
        return treatmentRepository.createTreatment(cedulaPaciente, descripcion, fechaInicio, fechaFin);
    }

    public List<Treatment> getTreatmentsByCedulaPaciente(String cedulaPaciente) {
        return treatmentRepository.findByCedulaPaciente(cedulaPaciente);
    }

    public List<Treatment> getAllTreatments() {
        return treatmentRepository.getAllTreatments();
    }
}
