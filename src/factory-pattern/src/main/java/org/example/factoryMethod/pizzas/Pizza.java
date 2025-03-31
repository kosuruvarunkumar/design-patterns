package org.example.factoryMethod.pizzas;

import java.util.ArrayList;
import java.util.List;

abstract public class Pizza {
    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<>();

    public String getName() {
        return this.name;
    }

    public void prepare() {
        System.out.println("Preparing: " + name);
    }

    public void bake() {
        System.out.println("Bake: "+ name);
    }

    public void cut() {
        System.out.println("Cut: "+ name);
    }

    public void box() {
        System.out.println("Box: "+ name);
    }

    public String toString() {
        StringBuilder displayText = new StringBuilder();
        displayText.append("-----").append(name).append("-----\n")
                .append("Dough: ").append(dough).append("\n").append("Sauce: ").append(sauce).append("\n")
                .append("Toppings: ");
        for(String topping : toppings) {
            displayText.append(topping).append("\t");
        }
        displayText.append("\n");
        return displayText.toString();
    }
}
