package com.practise.spring.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "slots")
public class ParkingSlot {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int parking_lot_id;
    private boolean occupied;

    public ParkingSlot() {
    }

    public ParkingSlot(int id, int parking_lot_id, boolean occupied) {
        this.id = id;
        this.parking_lot_id = parking_lot_id;
        this.occupied = occupied;
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

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ParkingSlot that = (ParkingSlot) o;
        return id == that.id && parking_lot_id == that.parking_lot_id && occupied == that.occupied;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, parking_lot_id, occupied);
    }

    @Override
    public String toString() {
        return "ParkingSlot{" +
                "id=" + id +
                ", parking_lot_id=" + parking_lot_id +
                ", occupied=" + occupied +
                '}';
    }
}

