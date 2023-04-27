package com.example.carrental.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "car_information")
public class CarInformation {

    @Id
    private Integer id;

    private String carId;
    private String carName;
    private Double price;
    private String brand;
    private String color;
    private Integer numberOfSeats;
    private String availableDate;
    private String status;
}
