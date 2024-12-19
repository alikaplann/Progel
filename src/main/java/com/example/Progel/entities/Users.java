package com.example.Progel.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String role; // ROLE_PATIENT, ROLE_DOCTOR, ROLE_ADMIN gibi değerler

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    // Getter ve Setter metotları
}
