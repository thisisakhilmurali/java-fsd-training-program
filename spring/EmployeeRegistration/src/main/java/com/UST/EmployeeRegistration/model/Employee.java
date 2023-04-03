package com.UST.EmployeeRegistration.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

// Entity Class (POJO Class)
// @Entity is to show that the class is going to store in DB
// @Id --> Primary Key
// @GeneratedValue --> autoincrement
@Entity
public class Employee {
    @Id
    @GeneratedValue
    private int id;
    private String employeeId;
    private String employeeName;
    private String address;
    private String location;

    public Employee(int id, String employeeId, String employeeName, String address, String location) {
        this.id = id;
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.address = address;
        this.location = location;
    }

    public Employee() {

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
