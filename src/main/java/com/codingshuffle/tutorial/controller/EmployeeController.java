package com.codingshuffle.tutorial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//Operation
//GET /employees
//POST /employees
//DELETE /employees/{id}

@Controller
public class EmployeeController {

    @GetMapping(path = "/employees")
    public String getEmployees() {
        return "Hello World";
    }

}
