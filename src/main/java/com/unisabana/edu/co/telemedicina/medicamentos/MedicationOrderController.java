package com.unisabana.edu.co.telemedicina.medicamentos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/medication-orders")
public class MedicationOrderController {

    @Autowired
    private MedicationOrderService medicationOrderService;

    @PostMapping
    public ResponseEntity<MedicationOrder> createMedicationOrder(@RequestBody MedicationOrder order) {
        MedicationOrder createdOrder = medicationOrderService.createMedicationOrder(
                order.getCedulaPaciente(),
                order.getMedicamento(),
                order.getCantidad(),
                order.getIndicaciones(),
                LocalDate.now()
        );
        return ResponseEntity.ok(createdOrder);
    }

    @GetMapping("/patient/{cedulaPaciente}")
    public ResponseEntity<List<MedicationOrder>> getMedicationOrdersByCedulaPaciente(@PathVariable String cedulaPaciente) {
        List<MedicationOrder> orders = medicationOrderService.getMedicationOrdersByCedulaPaciente(cedulaPaciente);
        return ResponseEntity.ok(orders);
    }

    @GetMapping
    public ResponseEntity<List<MedicationOrder>> getAllMedicationOrders() {
        List<MedicationOrder> orders = medicationOrderService.getAllMedicationOrders();
        return ResponseEntity.ok(orders);
    }
}