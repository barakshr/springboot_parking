package com.practise.spring.reposervice;

import com.practise.spring.entities.ParkingSlot;
import com.practise.spring.repo.ParkingSlotsRepository;

import java.util.List;
import java.util.Optional;

public class ParkingSlotsRepoServiceImpl implements DBRepoService<ParkingSlot> {

    private final ParkingSlotsRepository parkingSlotsRepository;

   public ParkingSlotsRepoServiceImpl(ParkingSlotsRepository parkingSlotsRepository) {
        this.parkingSlotsRepository = parkingSlotsRepository;

    }


    @Override
    public Optional<ParkingSlot> findById(long id) {
        return parkingSlotsRepository.findById(id);

    }

    @Override
    public List<ParkingSlot> findAll() {
        return (List<ParkingSlot>) parkingSlotsRepository.findAll();
    }
}
