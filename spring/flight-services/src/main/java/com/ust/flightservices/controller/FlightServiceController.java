package com.ust.flightservices.controller;

import com.ust.flightservices.dto.BookingRequest;
import com.ust.flightservices.dto.FlightBookingAcknowledgement;
import com.ust.flightservices.exception.InsufficentAmountException;
import com.ust.flightservices.service.FlightBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FlightServiceController {


    @Autowired
    private FlightBookingService flightBookingService;

    @PostMapping("/booking")
    public FlightBookingAcknowledgement bookingFlightTicket(@RequestBody BookingRequest bookingRequest) throws InsufficentAmountException {
        return flightBookingService.bookingFlightTicket(bookingRequest);
    }


}
