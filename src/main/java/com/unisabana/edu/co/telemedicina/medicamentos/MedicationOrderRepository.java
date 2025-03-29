package com.unisabana.edu.co.telemedicina.medicamentos;

import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class MedicationOrderRepository {

    private List<MedicationOrder> medicationOrders = new ArrayList<>();
    private Long idCounter = 1L;

    public MedicationOrder createMedicationOrder(String cedulaPaciente, String medicamento, int cantidad, String indicaciones, LocalDate fechaOrden) {
        MedicationOrder order = new MedicationOrder(idCounter++, cedulaPaciente, medicamento, cantidad, indicaciones, fechaOrden);
        medicationOrders.add(order);
        return order;
    }

    public Optional<MedicationOrder> findById(Long id) {
        return medicationOrders.stream()
                .filter(order -> order.getId().equals(id))
                .findFirst();
    }

    public List<MedicationOrder> findByCedulaPaciente(String cedulaPaciente) {
        List<MedicationOrder> patientOrders = new ArrayList<>();
        for (MedicationOrder order : medicationOrders) {
            if (order.getCedulaPaciente().equals(cedulaPaciente)) {
                patientOrders.add(order);
            }
        }
        return patientOrders;
    }

    public List<MedicationOrder> getAllMedicationOrders() {
        return medicationOrders;
    }
}