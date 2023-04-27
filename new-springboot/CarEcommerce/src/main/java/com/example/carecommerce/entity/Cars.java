package com.example.carecommerce.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "car_details")
public class Cars {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String manufacturingYear;

    @ElementCollection
    private List<String> colors;

    private String model;

    @ElementCollection
    private List<String> accessories;

    private Double price;

    @ElementCollection
    private List<String> payment;

    @ElementCollection
    private List<String> cities;

}
