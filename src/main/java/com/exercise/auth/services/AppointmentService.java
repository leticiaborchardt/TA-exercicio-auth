package com.exercise.auth.services;

import com.exercise.auth.domain.appointment.Appointment;
import com.exercise.auth.domain.appointment.AppointmentDTO;
import com.exercise.auth.repositories.AppointmentRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppointmentService {
    @Autowired
    private AppointmentRepository appointmentRepository;

    public List<Appointment> getAllAppointments() {
        return appointmentRepository.findAll();
    }

    public Optional<Appointment> getAppointmentById(String id) {
        return appointmentRepository.findById(id);
    }

    public Appointment createAppointment(AppointmentDTO newAppointment) {
        var appointment = new Appointment();
        BeanUtils.copyProperties(newAppointment, appointment);

        return appointmentRepository.save(appointment);
    }
}
