package com.unisabana.edu.co.telemedicina.medicamentos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class MedicationOrderService {

    @Autowired
    private MedicationOrderRepository medicationOrderRepository;

    public MedicationOrder createMedicationOrder(String cedulaPaciente, String medicamento, int cantidad, String indicaciones, LocalDate fechaOrden) {
        return medicationOrderRepository.createMedicationOrder(cedulaPaciente, medicamento, cantidad, indicaciones, fechaOrden);
    }

    public List<MedicationOrder> getMedicationOrdersByCedulaPaciente(String cedulaPaciente) {
        return medicationOrderRepository.findByCedulaPaciente(cedulaPaciente);
    }

    public List<MedicationOrder> getAllMedicationOrders() {
        return medicationOrderRepository.getAllMedicationOrders();
    }
}