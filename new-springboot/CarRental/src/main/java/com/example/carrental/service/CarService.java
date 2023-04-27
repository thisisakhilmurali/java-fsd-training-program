package com.example.carrental.service;

import com.example.carrental.entity.CarInformation;
import com.example.carrental.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;


    public List<CarInformation> getAllCars() {
        return carRepository.findAll();
    }

    public List<CarInformation> getAllAvailableCars(String date) {
        return carRepository.findByAvailableDate(date);
    }
}
