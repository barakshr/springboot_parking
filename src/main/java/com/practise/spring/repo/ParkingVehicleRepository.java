package com.practise.spring.repo;

import com.practise.spring.entities.ParkingVehicle;
import org.springframework.data.repository.CrudRepository;

public interface ParkingVehicleRepository extends CrudRepository<ParkingVehicle,Long> {

}
