package com.unisabana.edu.co.telemedicina.tratamientos;

import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class TreatmentRepository {

    private List<Treatment> treatments = new ArrayList<>();
    private Long idCounter = 1L;

    public Treatment createTreatment(String cedulaPaciente, String descripcion, LocalDate fechaInicio, LocalDate fechaFin) {
        Treatment treatment = new Treatment(idCounter++, cedulaPaciente, descripcion, fechaInicio, fechaFin);
        treatments.add(treatment);
        return treatment;
    }

    public Optional<Treatment> findById(Long id) {
        return treatments.stream()
                .filter(treatment -> treatment.getId().equals(id))
                .findFirst();
    }

    public List<Treatment> findByCedulaPaciente(String cedulaPaciente) {
        List<Treatment> patientTreatments = new ArrayList<>();
        for (Treatment treatment : treatments) {
            if (treatment.getCedulaPaciente().equals(cedulaPaciente)) {
                patientTreatments.add(treatment);
            }
        }
        return patientTreatments;
    }

    public List<Treatment> getAllTreatments() {
        return treatments;
    }
}
