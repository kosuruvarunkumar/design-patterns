package org.example.factoryMethod.pizzas;

public class NYStyleCheezePizza extends Pizza {
    public NYStyleCheezePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}
