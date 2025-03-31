package org.example.simpleFactory;

import org.example.simpleFactory.pizzas.Pizza;

public class SimplePizzaFactoryDriver {
    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);

        Pizza cheezePizza = store.orderPizza("cheeze");
        System.out.println("Ordered a " + cheezePizza.getName());
        System.out.println(cheezePizza);
        Pizza veggiePizza = store.orderPizza("veggie");
        System.out.println("Ordered a " + veggiePizza.getName());
        System.out.println(veggiePizza);
        Pizza pizza = store.orderPizza("test");
        System.out.println("Ordered a " + pizza.getName());
        System.out.println(pizza);
    }
}
