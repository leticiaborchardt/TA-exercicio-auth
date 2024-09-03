package com.exercise.auth.domain.user;

public record LoginResponseDTO(
        String id,
        String username,
        String role,
        String token
) {
}
