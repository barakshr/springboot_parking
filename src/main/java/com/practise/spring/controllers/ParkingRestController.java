package com.practise.spring.controllers;

import com.practise.spring.entities.ParkingSlot;
import com.practise.spring.entities.ParkingVehicle;
import com.practise.spring.controllers.apiservice.ParkingApiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@SuppressWarnings("SpringJavaAutowiredFieldsWarningInspection")
@RestController
@RequestMapping("/api/v2")
public class ParkingRestController {

   // static final String BASE_URL="/api/v2";

    private static final Logger LOGGER = LoggerFactory.getLogger(ParkingRestController.class);
    private final ParkingApiService parkingApiService;
    @Autowired
    private Environment env;

    ParkingRestController(ParkingApiService parkingApiService) {
        this.parkingApiService = parkingApiService;
    }


    void f(){
        Lock x= new ReentrantLock();

        Thread thread= new Thread(()->System.out.println(""));
        thread.start();
    }

    @GetMapping("/parking_slots_table")
    public ResponseEntity<List<ParkingSlot>> getParkingSlotsTable(@RequestParam(value = "myName", defaultValue = "") String name) {
        LOGGER.debug("reading slots table");
        List<ParkingSlot> parkingSlots = parkingApiService.getSlotsTable();
        return ResponseEntity.accepted().body(parkingSlots);
    }

    @GetMapping("/parking_vehicle_table")
    public ResponseEntity<List<ParkingVehicle>> getParkingVehiclesTable() {
        List<ParkingVehicle> parkingVehicleList = parkingApiService.getVehicleTable();
        return ResponseEntity.accepted().body(parkingVehicleList);
    }
}
