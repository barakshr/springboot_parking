package com.practise.spring;

import com.practise.spring.bootstrap.BootStrapData;
import com.practise.spring.repo.ParkingSlotsRepository;
import com.practise.spring.repo.ParkingVehicleRepository;
import com.practise.spring.reposervice.ParkingSlotsRepoServiceImpl;
import com.practise.spring.controllers.apiservice.ParkingApiService;
import jdk.nashorn.internal.ir.annotations.Immutable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
public class ParkingConfiguration {

    @Bean
    BootStrapData bootStrapData() {
        //lll
        return new BootStrapData();

    }

    @Bean
    ParkingSlotsRepoServiceImpl parkingSlotsRepoService(ParkingSlotsRepository parkingSlotsRepository) {
        return new ParkingSlotsRepoServiceImpl(parkingSlotsRepository);
    }

    @Bean
    ParkingApiService parkingApiService(ParkingSlotsRepoServiceImpl parkingSlotsRepoService, ParkingVehicleRepository parkingVehicleRepository) {
        return new ParkingApiService(parkingSlotsRepoService, parkingVehicleRepository);
    }

}
