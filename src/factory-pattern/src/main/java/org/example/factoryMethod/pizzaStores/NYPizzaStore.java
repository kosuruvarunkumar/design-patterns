package org.example.factoryMethod.pizzaStores;

import org.example.factoryMethod.pizzas.NYStyleCheezePizza;
import org.example.factoryMethod.pizzas.NYStyleVeggiePizza;
import org.example.factoryMethod.pizzas.Pizza;

public class NYPizzaStore extends PizzaStore {
    public Pizza createPizza(String type) {
        Pizza pizza = switch (type) {
            case "veggie" -> new NYStyleVeggiePizza();
            default -> new NYStyleCheezePizza();
        };

        return pizza;
    }
}
