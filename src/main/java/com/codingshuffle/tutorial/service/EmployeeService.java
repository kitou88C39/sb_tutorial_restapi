package com.codingshuffle.tutorial.service;

import com.codingshuffle.tutorial.dto.EmployeeDTO;
import com.codingshuffle.tutorial.entities.EmployeeEntity;
import com.codingshuffle.tutorial.repositories.EmployeeRepository;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    final EmployeeRepository employeeRepository;
    final ModelMapper modelMapper;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public EmployeeDTO getEmployeeById(Long id) {
        EmployeeEntity employeeEntity = employeeRepository.getById(id);
        return 
                
    }

    createNewEmployee(EmployeeDTO employeeDTO){
        
    }
}
