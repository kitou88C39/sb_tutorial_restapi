package com.codingshuffle.tutorial.controller;

//Operation
//GET /employees
//POST /employees
//DELETE /employees/{id}

import com.codingshuffle.tutorial.dto.EmployeeDTO;
import com.codingshuffle.tutorial.service.EmployeeService;

import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.*;

//import java.time.LocalDate;

@RestController
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(path = "/employees/{id}")
    public EmployeeDTO getEmployeeById(@PathVariable("id") Long employeeId) {
        return employeeService.getEmployeeById(employeeId);
    }

    @PostMapping(path = "/employees")
    public String getData(@RequestBody EmployeeDTO employeeDTO) {

    }

}
