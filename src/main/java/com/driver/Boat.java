package com.driver;

public class Boat implements WaterVehicle{

    private String name;
    private int capacity;

    public Boat(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @java.lang.Override
    public String getVehicleName() {
        return null;
    }

    @java.lang.Override
    public int getVehicleCapacity() {
        return 0;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }
}
