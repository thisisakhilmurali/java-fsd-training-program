package com.ust.flightservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class FlightServicesApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlightServicesApplication.class, args);
    }

}
