package org.example.components;

public class GPSNavigator {
    private String route;

    public String getRoute() {
        return route;
    }

    public GPSNavigator() {
        this.route = "ORR, Bengaluru";
    }

    public GPSNavigator(String route) {
        this.route = route;
    }
}
