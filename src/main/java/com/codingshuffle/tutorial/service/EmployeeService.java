package com.codingshuffle.tutorial.service;

import com.codingshuffle.tutorial.dto.EmployeeDTO;
import com.codingshuffle.tutorial.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository EmployeeRepository;

    public EmployeeDTO getEmployeeById(Long id) {

    }

}
