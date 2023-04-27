package com.example.carrental.controller;


import com.example.carrental.entity.CarInformation;
import com.example.carrental.service.CarService;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.times;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(CarController.class)
public class CarControllerTest {

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private CarService carService;
    private CarInformation carInformation;

    @BeforeEach
    void setup() {
        carInformation = new CarInformation(
                1,
                "SHMT112",
                "City ZX",
                3500.00,
                "Honda",
                "Pearl White",
                5,
                "12-03-202",
                "Booked"
        );
    }

    @Test
    public void testGetAllCarInformation() throws Exception {
        CarInformation carInformation1 = new CarInformation(
                1,
                "SHMT112",
                "City ZX",
                3500.00,
                "Hyundai",
                "White",
                5,
                "12-03-202",
                "Booked"
        );

        CarInformation carInformation2 = new CarInformation(
                2,
                "SHMT113",
                "City ZX",
                3500.00,
                "Hyundai",
                "White",
                5,
                "12-03-202",
                "Booked"
        );

        List<CarInformation> carInformationList = new ArrayList<>();
        carInformationList.add(carInformation1);
        carInformationList.add(carInformation2);

        Mockito.when(carService.getAllCars()).thenReturn(carInformationList);

        mockMvc.perform(MockMvcRequestBuilders.get("/sharathcars/cars")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$[0].id", is(carInformation1.getId())))
                .andExpect(jsonPath("$[0].carId", is(carInformation1.getCarId())))
                .andExpect(jsonPath("$[0].carName", is(carInformation1.getCarName())))
                .andExpect(jsonPath("$[0].price", is(carInformation1.getPrice())))
                .andExpect(jsonPath("$[0].brand", is(carInformation1.getBrand())))
                .andExpect(jsonPath("$[0].color", is(carInformation1.getColor())))
                .andExpect(jsonPath("$[0].numberOfSeats", is(carInformation1.getNumberOfSeats())))
                .andExpect(jsonPath("$[0].availableDate", is(carInformation1.getAvailableDate())))
                .andExpect(jsonPath("$[0].status", is(carInformation1.getStatus())))

                .andExpect(jsonPath("$[1].id", is(carInformation2.getId())))
                .andExpect(jsonPath("$[1].carId", is(carInformation2.getCarId())))
                .andExpect(jsonPath("$[1].carName", is(carInformation2.getCarName())))
                .andExpect(jsonPath("$[1].price", is(carInformation2.getPrice())))
                .andExpect(jsonPath("$[1].brand", is(carInformation2.getBrand())))
                .andExpect(jsonPath("$[1].color", is(carInformation2.getColor())))
                .andExpect(jsonPath("$[1].numberOfSeats", is(carInformation2.getNumberOfSeats())))
                .andExpect(jsonPath("$[1].availableDate", is(carInformation2.getAvailableDate())))
                .andExpect(jsonPath("$[1].status", is(carInformation2.getStatus())));

        Mockito.verify(carService, times(1)).getAllCars();

    }

    @Test
    public void testGetCarByAvailableDate() throws Exception {

        CarInformation carInformation1 = new CarInformation(
                1,
                "SHMT112",
                "City ZX",
                3500.00,
                "Hyundai",
                "White",
                5,
                "12-03-2022",
                "Booked"
        );

        CarInformation carInformation2 = new CarInformation(
                2,
                "SHMT113",
                "City ZX",
                3500.00,
                "Hyundai",
                "White",
                5,
                "12-03-2022",
                "Booked"
        );

        List<CarInformation> carInformationList = new ArrayList<>();
        carInformationList.add(carInformation1);
        carInformationList.add(carInformation2);



        Mockito.when(carService.getAllAvailableCars( "12-03-2022")).thenReturn(carInformationList);

        mockMvc.perform(MockMvcRequestBuilders.get("/sharathcars/cars/12-03-2022")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$[0].id", is(carInformation1.getId())))
                .andExpect(jsonPath("$[0].carId", is(carInformation1.getCarId())))
                .andExpect(jsonPath("$[0].carName", is(carInformation1.getCarName())))
                .andExpect(jsonPath("$[0].price", is(carInformation1.getPrice())))
                .andExpect(jsonPath("$[0].brand", is(carInformation1.getBrand())))
                .andExpect(jsonPath("$[0].color", is(carInformation1.getColor())))
                .andExpect(jsonPath("$[0].numberOfSeats", is(carInformation1.getNumberOfSeats())))
                .andExpect(jsonPath("$[0].availableDate", is(carInformation1.getAvailableDate())))
                .andExpect(jsonPath("$[0].status", is(carInformation1.getStatus())))

                .andExpect(jsonPath("$[1].id", is(carInformation2.getId())))
                .andExpect(jsonPath("$[1].carId", is(carInformation2.getCarId())))
                .andExpect(jsonPath("$[1].carName", is(carInformation2.getCarName())))
                .andExpect(jsonPath("$[1].price", is(carInformation2.getPrice())))
                .andExpect(jsonPath("$[1].brand", is(carInformation2.getBrand())))
                .andExpect(jsonPath("$[1].color", is(carInformation2.getColor())))
                .andExpect(jsonPath("$[1].numberOfSeats", is(carInformation2.getNumberOfSeats())))
                .andExpect(jsonPath("$[1].availableDate", is(carInformation2.getAvailableDate())))
                .andExpect(jsonPath("$[1].status", is(carInformation2.getStatus())));

        Mockito.verify(carService, times(1)).getAllAvailableCars( "12-03-2022");


    }


}
