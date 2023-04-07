package com.ust.flightservices.dto;


import com.ust.flightservices.entity.PassengerInformation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class FlightBookingAcknowledgement {

    private String status;
    private double amount;
    private String pnrNumber;
    private PassengerInformation passengerInformation;



}
