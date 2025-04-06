package org.example;

import org.example.builders.CarBuilder;
import org.example.builders.ManualBuilder;
import org.example.car.Car;
import org.example.car.Manual;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        ManualBuilder manualBuilder = new ManualBuilder();

        director.constructSportsCar(builder);
        director.constructSportsCar(manualBuilder);

        Car car = builder.getCar();
        Manual manual = manualBuilder.getManual();

        System.out.println(manual.toString());
        System.out.println(car.toString());

    }
}
