package com.example.employee.controller;


import com.example.employee.entity.Employee;
import com.example.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/org")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    // Adding employees
    @PostMapping("/addEmployee")
    public Employee createNewEmployee(@RequestBody Employee employee) {
        return employeeService.createNewEmployee(employee);
    }

    // Get all employees
    @GetMapping("/getEmployee")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    // Get employee by Id
    @GetMapping("/getEmployee/{id}")
    public Employee getEmployeeById(@PathVariable Long id) {
        return employeeService.getEmployeeById(id);
    }

    // Get Employee by EmployeeID
    @GetMapping("/getEmployeeByEId/{employeeId}")
    public Employee getEmployeeByEmployeeId(@PathVariable String employeeId) {
        return employeeService.getEmployeeByEmployeeId(employeeId);
    }

    // Delete employee by Id
    @DeleteMapping("/deleteEmployee/{employeeId}")
    public String deleteEmployeeById(@PathVariable String employeeId) {
        return employeeService.deleteEmployeeById(employeeId);
    }

}
