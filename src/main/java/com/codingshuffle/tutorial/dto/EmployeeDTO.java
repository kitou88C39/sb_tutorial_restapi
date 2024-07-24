package com.codingshuffle.tutorial.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.time.LocalDate;

@Data
@AllArgsConstructor
public class EmployeeDTO {

    private Long id;
    private String name;
    private LocalDate dateOfJoining;
    private boolean isActive;

    // public EmployeeDTO(Long id, String name, LocalDate dateOfJoining, boolean
    // isActive) {
    // this.id = id;
    // this.name = name;
    // this.dateOfJoining = dateOfJoining;
    // this.isActive = isActive;
    // }

    // public Long getId() {
    // return id;
    // }

    // public void setId(Long id) {
    // this.id = id;
    // }

    // public String getName() {
    // return name;
    // }

    // public void setName(String name) {
    // this.name = name;
    // }

    // public LocalDate getDateOfJoining() {
    // return dateOfJoining;
    // }

    // public void setDateOfJoining(LocalDate dateOfJoining) {
    // this.dateOfJoining = dateOfJoining;
    // }

    // public boolean isActive() {
    // return isActive;
    // }

    // public void setActive(boolean isActive) {
    // this.isActive = isActive;
    // }
}
