package com.example.realestatedata.service;

import com.example.realestatedata.entity.REData;
import com.example.realestatedata.repository.ERepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EService {

    @Autowired
    private ERepository eRepository;


    public List<REData> getHousesByZipCode(int zcode) {
        return eRepository.findAllByZipCode(zcode);
    }

    public List<REData> getHousesByState(String state) {
        return eRepository.findAllByState(state);
    }

    public List<REData> getHousesByCity(String city) {
        return eRepository.findAllByCity(city);
    }

    public List<REData> getHousesByPrice(double minPrice, double maxPrice) {
        return eRepository.findAllByPriceBetween(minPrice, maxPrice);
    }

    public List<REData> getTwoBathRoomHouses(int num) {
        return eRepository.findAllByBath(num);
    }

    public List<REData> getTwoBedRoomHouses(int num) {
        return eRepository.findAllByBed(num);
    }

    public Integer getCount(String city) {

        List<REData> list = eRepository.findAllByCity(city);

        return list.size();
    }
}
