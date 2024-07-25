package com.codingshuffle.tutorial.controller;

import com.codingshuffle.tutorial.dto.EmployeeDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
//import java.util.Date;

//Operation
//GET /employees
//POST /employees
//DELETE /employees/{id}

@RestController
public class EmployeeController {

    @GetMapping(path = "/employees/{id}")
    public EmployeeDTO getEmployees(@PathVariable Long id) {
        return new EmployeeDTO(id, "Anuj", LocalDate.of(2024, 1, 1), true);
    }

}
