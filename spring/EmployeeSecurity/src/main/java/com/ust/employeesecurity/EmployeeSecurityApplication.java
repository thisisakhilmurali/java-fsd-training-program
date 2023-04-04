package com.ust.employeesecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
//@EnableWebSecurity
public class EmployeeSecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployeeSecurityApplication.class, args);
    }

}
