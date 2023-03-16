package org.employee;

public class Employee {
    private final String phoneNumber;
    private final String emailId;
    private final String addressPresent;
    private final String employeeId;
    private final String name;
    private final String location;
    private final double salary;

    public Employee(String phoneNumber, String emailId, String addressPresent, String employeeId, String name, String location, double salary) {
        this.phoneNumber = phoneNumber;
        this.emailId = emailId;
        this.addressPresent = addressPresent;
        this.employeeId = employeeId;
        this.name = name;
        this.location = location;
        this.salary = salary;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getAddressPresent() {
        return addressPresent;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public double getSalary() {
        return salary;
    }
}
