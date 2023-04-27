package com.example.carrental.service;

import com.example.carrental.entity.CarInformation;
import com.example.carrental.repository.CarRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CarServiceTest {

    @Mock
    private CarRepository mockCarRepository;

    @InjectMocks
    private CarService carServiceUnderTest;

    @Test
    void testGetAllCars() {
        // Setup
        final List<CarInformation> expectedResult = List.of(
                new CarInformation(0, "carId", "carName", 0.0, "brand", "color", 0, "availableDate", "status"));

        // Configure CarRepository.findAll(...).
        final List<CarInformation> carInformations = List.of(
                new CarInformation(0, "carId", "carName", 0.0, "brand", "color", 0, "availableDate", "status"));
        when(mockCarRepository.findAll()).thenReturn(carInformations);

        // Run the test
        final List<CarInformation> result = carServiceUnderTest.getAllCars();

        // Verify the results
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void testGetAllCars_CarRepositoryReturnsNoItems() {
        // Setup
        when(mockCarRepository.findAll()).thenReturn(Collections.emptyList());

        // Run the test
        final List<CarInformation> result = carServiceUnderTest.getAllCars();

        // Verify the results
        assertThat(result).isEqualTo(Collections.emptyList());
    }

    @Test
    void testGetAllAvailableCars() {
        // Setup
        final List<CarInformation> expectedResult = List.of(
                new CarInformation(0, "carId", "carName", 0.0, "brand", "color", 0, "availableDate", "status"));

        // Configure CarRepository.findByAvailableDate(...).
        final List<CarInformation> carInformations = List.of(
                new CarInformation(0, "carId", "carName", 0.0, "brand", "color", 0, "availableDate", "status"));
        when(mockCarRepository.findByAvailableDate("date")).thenReturn(carInformations);

        // Run the test
        final List<CarInformation> result = carServiceUnderTest.getAllAvailableCars("date");

        // Verify the results
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void testGetAllAvailableCars_CarRepositoryReturnsNoItems() {
        // Setup
        when(mockCarRepository.findByAvailableDate("date")).thenReturn(Collections.emptyList());

        // Run the test
        final List<CarInformation> result = carServiceUnderTest.getAllAvailableCars("date");

        // Verify the results
        assertThat(result).isEqualTo(Collections.emptyList());
    }
}
