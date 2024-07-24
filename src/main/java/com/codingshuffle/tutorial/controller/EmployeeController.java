package com.codingshuffle.tutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Operation
//GET /employees
//POST /employees
//DELETE /employees/{id}

@RestController
public class EmployeeController {

    @GetMapping(path = "/employees")
    public String getEmployees() {
        return "Hello World";
    }

}
