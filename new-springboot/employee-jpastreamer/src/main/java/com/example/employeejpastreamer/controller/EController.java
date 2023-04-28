package com.example.employeejpastreamer.controller;


import com.example.employeejpastreamer.entity.Employee;
import com.example.employeejpastreamer.service.EService;
import com.speedment.jpastreamer.application.JPAStreamer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EController {

    @Autowired
    private EService eService;


    @PostMapping("/add")
    public List<Employee> addEmployees(@RequestBody List<Employee> employeeList) {
        return eService.addEmployees(employeeList);
    }

    @GetMapping("/getall")
    public List<Employee> getAllEmployees() {
        return eService.getAllEmployees();
    }

}
