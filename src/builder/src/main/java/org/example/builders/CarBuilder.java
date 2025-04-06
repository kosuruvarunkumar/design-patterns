package org.example.builders;

import org.example.car.Car;
import org.example.car.CarType;
import org.example.components.Engine;
import org.example.components.GPSNavigator;
import org.example.components.Transmission;

public class CarBuilder implements Builder{
    private CarType carType;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private GPSNavigator gpsNavigator;

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Car getCar() {
        return new Car(carType, engine, seats, transmission, gpsNavigator);
    }
}
