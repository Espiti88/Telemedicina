package com.unisabana.edu.co.telemedicina.citas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;

    public Appointment createAppointment(Appointment appointment) {
        return appointmentRepository.createAppointment(appointment.getCedulaPaciente(), appointment.getFechaHora());
    }

    public List<Appointment> getAllAppointments() {
        return appointmentRepository.getAllAppointments();
    }

    public boolean deleteAppointment(Long id) {
        return appointmentRepository.deleteAppointmentById(id);
    }
}
