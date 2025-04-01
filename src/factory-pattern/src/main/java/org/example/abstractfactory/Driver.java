package org.example.abstractfactory;

import org.example.abstractfactory.pizzas.Pizza;
import org.example.abstractfactory.pizzastores.ChicagoPizzaStore;
import org.example.abstractfactory.pizzastores.NYPizzaStore;
import org.example.abstractfactory.pizzastores.PizzaStore;

import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore cStore = new ChicagoPizzaStore();

        Pizza nyPpizza = nyStore.orderPizza("pepperoni");
        System.out.println("Ordered: "+ nyPpizza);
        Pizza nyCpizza = nyStore.orderPizza("cheeze");
        System.out.println("Ordered: "+ nyCpizza);

        Pizza cPPizza = cStore.orderPizza("pepperoni");
        System.out.println("Ordered: "+ cPPizza);
        Pizza cCPizza = cStore.orderPizza("Cheeze");
        System.out.println("Ordered: "+ cCPizza);
    }
}
