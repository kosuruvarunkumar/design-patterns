package org.example.factoryMethod.pizzaStores;

import org.example.factoryMethod.pizzas.*;

public class ChicagoPizzaStore extends PizzaStore {
    Pizza createPizza(String type) {
        Pizza pizza = switch (type) {
            case "veggie" -> new ChicagoStyleVeggiePizza();
            default -> new ChicagoStyleVeggiePizza();
        };

        return pizza;
    }
}
