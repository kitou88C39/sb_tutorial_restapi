package com.codingshuffle.tutorial.controller;

import com.codingshuffle.tutorial.dto.EmployeeDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
//import java.util.Date;

//Operation
//GET /employees
//POST /employees
//DELETE /employees/{id}

@RestController
public class EmployeeController {

    @GetMapping(path = "/employees")
    public EmployeeDTO getEmployees() {
        return new EmployeeDTO(12l, "Anuj", LocalDate.of(2024, 1, 1), true);
    }

}
