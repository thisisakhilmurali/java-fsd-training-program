package com.UST.EmployeeRegistration.service;

import com.UST.EmployeeRegistration.model.Employee;
import com.UST.EmployeeRegistration.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(int id) {
        return employeeRepository.findById(id).orElse(null);
    }


    public Employee updateEmployee(Employee employee) {

        Employee oldEmployee = null;
        Optional<Employee> optionalEmployee = employeeRepository.findById(employee.getId());

        if (optionalEmployee.isPresent()) {
            oldEmployee = optionalEmployee.get();
            oldEmployee.setEmployeeId(employee.getEmployeeId());
            oldEmployee.setEmployeeName(employee.getEmployeeName());
            oldEmployee.setAddress(employee.getAddress());
            oldEmployee.setLocation(employee.getLocation());
            employeeRepository.save(oldEmployee);
        } else  {
            return  new Employee();
        }

        return oldEmployee;
    }

    public String deleteEmployeeById(int id) {
        employeeRepository.deleteById(id);
        return "Employee Deletion Successful";
    }
}
