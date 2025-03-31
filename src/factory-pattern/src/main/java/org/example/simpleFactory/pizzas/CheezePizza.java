package org.example.simpleFactory.pizzas;

public class CheezePizza extends Pizza {
    public CheezePizza() {
        name = "Cheeze Pizza";
        dough = "Thin Crust";
        sauce = "Tomato Sauce";
        toppings.add("Fresh Mozzarella");
    }
}
