package org.example.simpleFactory;

import org.example.simpleFactory.pizzas.*;

public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = switch (type) {
            case "veggie" -> new VeggiePizza();
            case "clam" -> new ClamPizza();
            case "pepperoni" -> new PepperoniPizza();
            default -> new CheezePizza();
        };
        return pizza;
    }
}
