package com.example.carrental.controller;

import com.example.carrental.entity.CarInformation;
import com.example.carrental.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sharathcars")
public class CarController {

    @Autowired
    private CarService carService;


    @GetMapping("/cars")
    public List<CarInformation> getAllCars() {
        return carService.getAllCars();
    }

    @GetMapping("/cars/{date}")
    public List<CarInformation> getAllAvailableCars(@PathVariable String date) {
        return carService.getAllAvailableCars(date);
    }

}
