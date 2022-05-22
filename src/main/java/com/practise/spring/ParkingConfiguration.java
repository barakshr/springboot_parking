package com.practise.spring;

import com.practise.spring.repo.ParkingSlotsRepository;
import com.practise.spring.repo.ParkingVehicleRepository;
import com.practise.spring.rest.ParkingApiService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ParkingConfiguration {


    @Bean
    ParkingApiService parkingApiService(ParkingSlotsRepository parkingSlotsRepository, ParkingVehicleRepository parkingVehicleRepository){
        return new ParkingApiService(parkingSlotsRepository,parkingVehicleRepository);
    }

}
