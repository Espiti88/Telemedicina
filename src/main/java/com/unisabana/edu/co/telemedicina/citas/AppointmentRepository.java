package com.unisabana.edu.co.telemedicina.citas;

import org.springframework.stereotype.Repository;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class AppointmentRepository {

    private List<Appointment> appointments = new ArrayList<>();
    private Long idCounter = 1L;

    public Appointment createAppointment(String cedula, LocalDateTime fechaHora) {
        Appointment appointment = new Appointment(idCounter++, cedula, fechaHora, true); // Estado inicial: true
        appointments.add(appointment);
        return appointment;
    }

    public Optional<Appointment> findById(Long id) {
        return appointments.stream()
                .filter(appointment -> appointment.getId().equals(id))
                .findFirst();
    }

    public List<Appointment> getAllAppointments() {
        return appointments;
    }

    public boolean deleteAppointmentById(Long id) {
        Optional<Appointment> appointment = findById(id);
        if (appointment.isPresent()) {
            appointments.remove(appointment.get());
            return true;
        }
        return false;
    }

    public boolean updateAppointmentStatus(Long id, boolean estado) {
        Optional<Appointment> appointment = findById(id);
        if (appointment.isPresent()) {
            appointment.get().setEstado(estado);
            return true;
        }
        return false;
    }
}