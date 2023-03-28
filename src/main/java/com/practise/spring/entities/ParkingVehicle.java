package com.practise.spring.entities;


import javax.persistence.*;

@Entity
@Table(name = "vehicle")
public class ParkingVehicle {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int parking_lot_id;

    private String parking_slots;
    private String vehicle_data;

    public ParkingVehicle() {
    }


    @SuppressWarnings("unused")
    public ParkingVehicle(int id, int parking_lot_id, String parking_slots, String vehicle_data) {
        this.id = id;
        this.parking_lot_id = parking_lot_id;
        this.parking_slots = parking_slots;
        this.vehicle_data = vehicle_data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getParking_lot_id() {
        return parking_lot_id;
    }

    public void setParking_lot_id(int parking_lot_id) {
        this.parking_lot_id = parking_lot_id;
    }

    public String getParking_slots() {
        return parking_slots;
    }

    public void setParking_slots(String parking_slots) {
        this.parking_slots = parking_slots;
    }

    public String getVehicle_data() {
        return vehicle_data;
    }

    public void setVehicle_data(String vehicle_data) {
        this.vehicle_data = vehicle_data;
    }
}
