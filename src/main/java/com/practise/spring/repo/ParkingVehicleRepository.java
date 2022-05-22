package com.practise.spring.repo;

import com.practise.spring.model.ParkingVehicle;
import org.springframework.data.repository.CrudRepository;

public interface ParkingVehicleRepository extends CrudRepository<ParkingVehicle,Long> {

}
