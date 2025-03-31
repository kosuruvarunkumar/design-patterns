package org.example.factoryMethod;

import org.example.factoryMethod.pizzaStores.ChicagoPizzaStore;
import org.example.factoryMethod.pizzaStores.NYPizzaStore;
import org.example.factoryMethod.pizzaStores.PizzaStore;
import org.example.factoryMethod.pizzas.Pizza;

import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        Pizza nyVeggie = nyPizzaStore.orderPizza("veggie");
        System.out.println("Ordered : " + nyVeggie.getName());

        Pizza chicagoVeggie = chicagoPizzaStore.orderPizza("veggie");
        System.out.println("Ordered : " + chicagoVeggie.getName());
    }
}
