package com.codingshuffle.tutorial.controller;

//Operation
//GET /employees
//POST /employees
//DELETE /employees/{id}

import com.codingshuffle.tutorial.dto.EmployeeDTO;
import com.codingshuffle.tutorial.service.EmployeeService;

import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping(path = "/employees")
    public String getData(@PathParam("sortBy") String sortBy, @PathParam("limit") Integer limit) {
        return "Hello " + sortBy + " " + limit;
    }

}
