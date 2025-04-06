package org.example.builders;

import org.example.car.CarType;
import org.example.components.Engine;
import org.example.components.GPSNavigator;
import org.example.components.Transmission;

public interface Builder {
    void setCarType(CarType carType);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setGPSNavigator(GPSNavigator gpsNavigator);
    void setSeats(int seats);
}
