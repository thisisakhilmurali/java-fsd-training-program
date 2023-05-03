package com.example.realestatedata.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "usa")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class REData {

    @Id
    @GeneratedValue
    private int id;

    private String status;

    private int bed;

    private int bath;

    private double acreLot;

    private String city;

    private String state;

    private int zipCode;

    private double houseSize;

    private String prevSoldDate;

    private double price;
}
