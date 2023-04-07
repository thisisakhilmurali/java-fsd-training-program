package com.ust.flightservices.dto;

import com.ust.flightservices.entity.PassengerInformation;
import com.ust.flightservices.entity.PaymentInformation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookingRequest {

    private PassengerInformation passengerInformation;
    private PaymentInformation paymentInformation;
}
