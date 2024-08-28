package com.exercise.auth.domain.user;

public enum UserRole {
    ADMIN("admin"),
    DOCTOR("doctor"),
    PATIENT("patient"),
    RECEPTIONIST("receptionist");

    private String role;

    UserRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}