package com.practise.spring.repo;

import com.practise.spring.model.ParkingSlot;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingSlotsRepository extends CrudRepository<ParkingSlot,Long> {


}
