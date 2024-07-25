package com.codingshuffle.tutorial.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "employees")
public class EmployeeEntity {
    private Long id;
    private String name;
    private LocalDate dateOfJoining;
    private boolean isActive;
}
