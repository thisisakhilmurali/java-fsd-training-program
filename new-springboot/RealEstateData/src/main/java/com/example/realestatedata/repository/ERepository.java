package com.example.realestatedata.repository;

import com.example.realestatedata.entity.REData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ERepository extends JpaRepository<REData, Integer> {

    public List<REData> findAllByZipCode(int zcode);

    public List<REData> findAllByState(String state);

    public List<REData> findAllByCity(String city);

    public List<REData> findAllByPriceBetween(double priceMin, double priceMax);

    public List<REData> findAllByBath(int bed);

    public List<REData> findAllByBed(int bed);

}
