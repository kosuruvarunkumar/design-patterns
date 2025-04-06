package org.example.car;

import org.example.components.Engine;
import org.example.components.GPSNavigator;
import org.example.components.Transmission;

public class Manual {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final GPSNavigator gpsNavigator;

    public Manual(CarType carType, int seats, Engine engine, Transmission transmission, GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.gpsNavigator = gpsNavigator;
    }

    public String toString() {
        StringBuilder manual = new StringBuilder("");
        manual.append("Type of Car: " + carType + "\n")
                .append("Seats: "+ seats + "\n")
                .append("Engine Volume: "+ engine.getVolume() + ", Engine Mileage: " + engine.getMileage() + "\n")
                .append("Transmission: " + transmission + "\n");
                if(gpsNavigator != null)
                    manual.append("GPSNavigator: " + gpsNavigator.getRoute());
                else
                    manual.append("GPSNavigator: " + "N/A \n");

        return manual.toString();
    }
}
