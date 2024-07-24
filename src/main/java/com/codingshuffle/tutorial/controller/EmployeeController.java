package com.codingshuffle.tutorial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

//Operation
//GET /employees
//POST /employees
//DELETE /employees/{id}

@Controller
public class EmployeeController {

    @GetMapping(path = "/employees")
    public String getMethodName(@RequestParam String param) {
        return new String();
    }

}
