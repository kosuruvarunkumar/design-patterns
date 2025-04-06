package org.example.car;

import org.example.components.Engine;
import org.example.components.GPSNavigator;
import org.example.components.Transmission;

public class Car {
    private CarType carType;
    private Engine engine;
    private int seats;
    private double fuel = 0;
    private Transmission transmission;
    private GPSNavigator gpsNavigator;

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public CarType getCarType() {
        return carType;
    }

    public Engine getEngine() {
        return engine;
    }

    public int getSeats() {
        return seats;
    }

    public double getFuel() {
        return fuel;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public GPSNavigator getGpsNavigator() {
        return gpsNavigator;
    }

    public Car(CarType carType, Engine engine, int seats, Transmission transmission, GPSNavigator gpsNavigator) {
        this.seats = seats;
        this.carType = carType;
        this.engine = engine;
        this.transmission = transmission;
        this.gpsNavigator = gpsNavigator;
    }

    public String toString() {
        StringBuilder car = new StringBuilder("");
        car.append("Type of Car: " + carType + "\n")
                .append("Seats: "+ seats + "\n")
                .append("Engine Volume: "+ engine.getVolume() + ", Engine Mileage: " + engine.getMileage() + "\n")
                .append("Transmission: " + transmission + "\n");
        if(gpsNavigator != null)
            car.append("GPSNavigator: " + gpsNavigator.getRoute());
        else
            car.append("GPSNavigator: " + "N/A \n");

        return car.toString();
    }

}
