package com.exercise.auth.domain.user;

import jakarta.validation.constraints.NotBlank;

public record AuthDTO (@NotBlank String login, @NotBlank String password) {
}
