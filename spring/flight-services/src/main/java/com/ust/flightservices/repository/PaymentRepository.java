package com.ust.flightservices.repository;

import com.ust.flightservices.entity.PaymentInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<PaymentInformation, String> {
}
