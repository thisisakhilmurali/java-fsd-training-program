package com.example.carrental.repository;

import com.example.carrental.entity.CarInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<CarInformation, Integer> {
    List<CarInformation> findByAvailableDate(String date);
}
