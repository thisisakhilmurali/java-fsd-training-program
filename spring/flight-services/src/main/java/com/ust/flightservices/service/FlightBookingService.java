package com.ust.flightservices.service;

import com.ust.flightservices.dto.BookingRequest;
import com.ust.flightservices.dto.FlightBookingAcknowledgement;
import com.ust.flightservices.entity.PassengerInformation;
import com.ust.flightservices.entity.PaymentInformation;
import com.ust.flightservices.exception.InsufficentAmountException;
import com.ust.flightservices.repository.PassengerRepository;
import com.ust.flightservices.repository.PaymentRepository;
import com.ust.flightservices.utils.PaymentUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.UUID;

@Service
public class FlightBookingService {

    @Autowired
    private PassengerRepository passengerRepository;
    @Autowired
    private PaymentRepository paymentRepository;

    @Transactional
    public FlightBookingAcknowledgement bookingFlightTicket(BookingRequest bookingRequest) throws InsufficentAmountException {
        PassengerInformation passengerInformation = bookingRequest.getPassengerInformation();
        passengerInformation = passengerRepository.save(passengerInformation);

        PaymentInformation paymentInformation = bookingRequest.getPaymentInformation();

        PaymentUtils.validateCreditLimit(paymentInformation.getAccountNumber(), passengerInformation.getFare());

        paymentInformation.setPassengerId(passengerInformation.getPassengerId());
        paymentInformation.setAmount((passengerInformation.getFare()));

        paymentRepository.save(paymentInformation);

        return new FlightBookingAcknowledgement(
                "Success",
                passengerInformation.getFare(),
                UUID.randomUUID().toString().split("-")[0],
                passengerInformation
        );
    }
}