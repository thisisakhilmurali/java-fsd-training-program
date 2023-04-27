package com.example.carecommerce.service;

import com.example.carecommerce.entity.Cars;
import com.example.carecommerce.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Arrays;
import java.util.List;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    public Cars addACar(Cars cars) {
        return carRepository.save(cars);
    }

    public Cars getMyCarPurchaseDetails(Long id) {

        List desiredColor = Arrays.asList("Pearl White");
        List desiredPayment = Arrays.asList("Online/Debit Card");
        List desiredCity = Arrays.asList("EKM");

        Cars cars =  carRepository.findById(id).orElse(null);

        if(cars != null) {
            cars.setColors(desiredColor);
            cars.setPayment(desiredPayment);
            cars.setCities(desiredCity);
        }

        return cars;

    }
}
