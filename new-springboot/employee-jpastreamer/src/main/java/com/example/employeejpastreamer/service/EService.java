package com.example.employeejpastreamer.service;


import com.example.employeejpastreamer.entity.Employee;
import com.example.employeejpastreamer.entity.Employee$;
import com.example.employeejpastreamer.repository.ERepository;
import com.speedment.jpastreamer.application.JPAStreamer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EService {

    @Autowired
    private ERepository eRepository;

    @Autowired
    private JPAStreamer jpaStreamer;

    public List<Employee> addEmployees(List<Employee> employeeList) {
        return eRepository.saveAll(employeeList);
    }

    public List<Employee> getAllEmployees() {
        return jpaStreamer.stream(Employee.class)
                .sorted(Employee$.salary.reversed())
                .collect(Collectors.toList());
    }
}
