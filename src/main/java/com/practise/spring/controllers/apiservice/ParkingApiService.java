package com.practise.spring.controllers.apiservice;


import com.practise.spring.entities.ParkingSlot;
import com.practise.spring.entities.ParkingVehicle;
import com.practise.spring.repo.ParkingVehicleRepository;
import com.practise.spring.reposervice.ParkingSlotsRepoServiceImpl;

import java.util.List;

public class ParkingApiService {

    private final ParkingSlotsRepoServiceImpl parkingSlotsRepoService;
    private final ParkingVehicleRepository parkingVehicleRepository;


    public ParkingApiService(ParkingSlotsRepoServiceImpl parkingSlotsRepoService, ParkingVehicleRepository parkingVehicleRepository) {
        this.parkingSlotsRepoService = parkingSlotsRepoService;
        this.parkingVehicleRepository = parkingVehicleRepository;
    }

    public List<ParkingSlot> getSlotsTable() {
        return parkingSlotsRepoService.findAll();
    }


    public List<ParkingVehicle> getVehicleTable() {
        return (List<ParkingVehicle>) parkingVehicleRepository.findAll();
    }

}
