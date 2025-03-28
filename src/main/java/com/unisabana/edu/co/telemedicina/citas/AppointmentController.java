package com.unisabana.edu.co.telemedicina.citas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/appointments")
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;

    @PostMapping
    public ResponseEntity<Appointment> createAppointment(@RequestBody Appointment appointment) {
        return ResponseEntity.ok(appointmentService.createAppointment(appointment));
    }

    @GetMapping
    public ResponseEntity<List<Appointment>> getAllAppointments() {
        List<Appointment> appointments = appointmentService.getAllAppointments();
        return ResponseEntity.ok(appointments);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteAppointment(@PathVariable Long id) {
        boolean isDeleted = appointmentService.deleteAppointment(id);
        if (isDeleted) {
            return ResponseEntity.ok("Cita eliminada exitosamente.");
        } else {
            return ResponseEntity.status(404).body("Cita no encontrada.");
        }
    }

    @PutMapping("/{id}/status")
    public ResponseEntity<String> updateAppointmentStatus(@PathVariable Long id, @RequestParam boolean estado) {
        boolean isUpdated = appointmentService.updateAppointmentStatus(id, estado);
        if (isUpdated) {
            return ResponseEntity.ok("Estado de la cita actualizado exitosamente.");
        } else {
            return ResponseEntity.status(404).body("Cita no encontrada.");
        }
    }

    @GetMapping("/patient/{cedulaPaciente}")
    public ResponseEntity<List<Appointment>> getAppointmentsByCedulaPaciente(@PathVariable String cedulaPaciente) {
        List<Appointment> appointments = appointmentService.getAppointmentsByCedulaPaciente(cedulaPaciente);
        return ResponseEntity.ok(appointments);
    }
}