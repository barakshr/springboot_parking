package com.practise.spring.rest;

import com.practise.spring.model.ParkingSlot;
import com.practise.spring.model.ParkingVehicle;
import com.practise.spring.repo.ParkingSlotsRepository;
import com.practise.spring.repo.ParkingVehicleRepository;

import java.util.List;

public class ParkingApiService {

    private final ParkingSlotsRepository parkingSlotsRepository;
    private final ParkingVehicleRepository parkingVehicleRepository;


    public ParkingApiService(ParkingSlotsRepository parkingSlotsRepository, ParkingVehicleRepository parkingVehicleRepository) {
        this.parkingSlotsRepository = parkingSlotsRepository;
        this.parkingVehicleRepository=parkingVehicleRepository;
    }

    List<ParkingSlot> getSlotsTable(){
         return  (List<ParkingSlot>) parkingSlotsRepository.findAll();
    }


    List<ParkingVehicle> getVehicleTable(){
        return  (List<ParkingVehicle>) parkingVehicleRepository.findAll();
    }

}
