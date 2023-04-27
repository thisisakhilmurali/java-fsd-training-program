package com.example.carecommerce.controller;

import com.example.carecommerce.entity.Cars;
import com.example.carecommerce.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarService carService;

    @PostMapping("/addcar")
    public Cars addACar(@RequestBody Cars cars) {
        return carService.addACar(cars);
    }


    @GetMapping("/getmycar/{id}")
    public Cars getMyCarPurchaseDetails(@PathVariable Long id) {
        return carService.getMyCarPurchaseDetails(id);
    }


}
