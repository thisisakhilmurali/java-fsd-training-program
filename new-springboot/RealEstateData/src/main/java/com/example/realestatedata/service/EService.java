package com.example.realestatedata.service;

import com.example.realestatedata.entity.REData;
import com.example.realestatedata.repository.ERepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

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

    public Map<String, Double> getEMI(int id, int month) {
        Optional<REData> reData = eRepository.findById(id);

        if(reData.isPresent()) {

            double price = reData.get().getPrice();

            double downPayment = price * 20 / 100;
            double principalAmount = price - downPayment;

            double r = 10.0;
            r = r / (12 * 100);

            double  emi = (principalAmount * r * (float)Math.pow(1 + r, month)) / (float)(Math.pow(1 + r, month) - 1);

            double totalAmount = downPayment + (emi * month);

            Map<String, Double> data = new HashMap<>();

            data.put("Price of House", price);
            data.put("Down Payment", (double) Math.round(downPayment));
            data.put("EMI Amount", (double) Math.round(emi));
            data.put("Tenure", (double) month);
            data.put("Total Payable", (double) Math.round(totalAmount));

            return data;

        } else {
            return null;
        }
    }
}
