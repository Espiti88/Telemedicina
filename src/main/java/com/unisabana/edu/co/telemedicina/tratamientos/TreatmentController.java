package com.unisabana.edu.co.telemedicina.tratamientos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/treatments")
public class TreatmentController {

    @Autowired
    private TreatmentService treatmentService;

    @PostMapping
    public ResponseEntity<Treatment> createTreatment(@RequestBody Treatment treatment) {
        Treatment createdTreatment = treatmentService.createTreatment(
                treatment.getCedulaPaciente(),
                treatment.getDescripcion(),
                treatment.getFechaInicio(),
                treatment.getFechaFin()
        );
        return ResponseEntity.ok(createdTreatment);
    }

    @GetMapping("/patient/{cedulaPaciente}")
    public ResponseEntity<List<Treatment>> getTreatmentsByCedulaPaciente(@PathVariable String cedulaPaciente) {
        List<Treatment> treatments = treatmentService.getTreatmentsByCedulaPaciente(cedulaPaciente);
        return ResponseEntity.ok(treatments);
    }

    @GetMapping
    public ResponseEntity<List<Treatment>> getAllTreatments() {
        List<Treatment> treatments = treatmentService.getAllTreatments();
        return ResponseEntity.ok(treatments);
    }
}
