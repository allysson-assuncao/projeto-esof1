package com.example.esof1_project.model;

import lombok.Getter;

@Getter
public enum UserRole {

    ADMIN("admin"),
    CASHIER("caixa"),
    WAITER("garçom");

    private String role;

    UserRole(String role) {
        this.role = role;
    }

}
