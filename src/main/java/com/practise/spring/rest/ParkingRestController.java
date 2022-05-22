package com.practise.spring.rest;

import com.practise.spring.model.ParkingSlot;
import com.practise.spring.model.ParkingVehicle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SuppressWarnings("SpringJavaAutowiredFieldsWarningInspection")
@RestController
public class ParkingRestController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ParkingRestController.class);
    private final ParkingApiService parkingApiService;
    @Autowired
    private Environment env;

    ParkingRestController(ParkingApiService parkingApiService) {
        this.parkingApiService = parkingApiService;
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
