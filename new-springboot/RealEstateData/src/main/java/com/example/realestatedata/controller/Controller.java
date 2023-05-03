package com.example.realestatedata.controller;

import com.example.realestatedata.entity.REData;
import com.example.realestatedata.service.EService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/q")
public class Controller {

    @Autowired
    private EService eService;

    @GetMapping("/zipcode/{zcode}")
    public List<REData> getHousesByZipCode(@PathVariable int zcode) {
        return eService.getHousesByZipCode(zcode);
    }

    @GetMapping("/state/{state}")
    public List<REData> getHousesByState(@PathVariable String state) {
        return eService.getHousesByState(state);
    }

    @GetMapping("/city/{city}")
    public List<REData> getHousesByCity(@PathVariable String city) {
        return eService.getHousesByCity(city);
    }

    @GetMapping("/price/{minPrice}/{maxPrice}")
    public List<REData> getHousesByPrice(@PathVariable double minPrice, @PathVariable double maxPrice) {
        return eService.getHousesByPrice(minPrice, maxPrice);
    }

    @GetMapping("/bathroom/{num}")
    public List<REData> getTwoBathRoomHouses(@PathVariable int num) {
        return eService.getTwoBathRoomHouses(num);
    }

    @GetMapping("/bedroom/{num}")
    public List<REData> getTwoBedRoomHouses(@PathVariable int num) {
        return eService.getTwoBedRoomHouses(num);
    }

    @GetMapping("/count/{city}")
    public Integer getCount(@PathVariable String city) {
        return eService.getCount(city);
    }

    @GetMapping("/findemi/{id}/{month}")
    public Map<String, Double> getEMI(@PathVariable int id, @PathVariable int month) {
        return eService.getEMI(id, month);
    }

}
