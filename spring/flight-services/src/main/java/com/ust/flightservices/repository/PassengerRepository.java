package com.ust.flightservices.repository;

import com.ust.flightservices.entity.PassengerInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerRepository extends JpaRepository<PassengerInformation, Long> {
}
