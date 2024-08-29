package com.exercise.auth.domain.appointment;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record AppointmentDTO(
        @NotBlank String description,
        @NotNull LocalDateTime dateTime,
        @NotBlank String doctor,
        @NotBlank String patient
) {
}
