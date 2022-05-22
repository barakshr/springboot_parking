CREATE SCHEMA IF NOT EXISTS parking_lot_management AUTHORIZATION postgres;
GRANT ALL ON SCHEMA parking_lot_management TO postgres;
COMMENT ON SCHEMA parking_lot_management IS 'Parking lot_management schema';
SET search_path TO parking_lot_management;

CREATE TABLE IF NOT EXISTS parking_lot_management.cities
(
    "id" serial PRIMARY KEY,
    "name" VARCHAR(255),
    "population" INT
);


CREATE TABLE IF NOT EXISTS parking_lot_management.slots
(
    "id"             SERIAL PRIMARY KEY NOT NULL,
    "parking_lot_id" INT,
    "occupied"       BOOLEAN
);


CREATE TABLE IF NOT EXISTS parking_lot_management.vehicle
(
    "id"             SERIAL PRIMARY KEY NOT NULL,
    "parking_lot_id" INT,
--     "parking_slots"  INT[],
    "parking_slots"  TEXT,
    "vehicle_data"   TEXT
)