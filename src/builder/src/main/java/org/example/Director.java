package org.example;

import org.example.builders.Builder;
import org.example.car.CarType;
import org.example.components.Engine;
import org.example.components.GPSNavigator;
import org.example.components.Transmission;

public class Director {
    public void constructSportsCar(Builder builder) {
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructCityCar(Builder builder) {
        builder.setCarType(CarType.CITY_CAR);
        builder.setEngine(new Engine(1.2, 0));
        builder.setSeats(4);
        builder.setTransmission(Transmission.AUTOMATIC);
    }

    public void constructSUV(Builder builder) {
        builder.setCarType(CarType.SUV);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.5, 0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setGPSNavigator(new GPSNavigator());
    }
}
