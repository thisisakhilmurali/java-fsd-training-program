package com.ust.flightservices.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "PASSENGER_INFORMATION")
public class PassengerInformation {

    @Id
    @GeneratedValue()
    private Long passengerId;
    private String passengerName;
    private String passengerEmail;
    private String source;
    private String destination;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-mm-yyyy")
    private Date travelDate;
    private String pickupTime;
    private String arrivalTime;
    private double fare;

}
