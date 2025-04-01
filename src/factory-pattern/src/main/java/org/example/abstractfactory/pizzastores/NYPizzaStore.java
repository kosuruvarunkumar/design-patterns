package org.example.abstractfactory.pizzastores;

import org.example.abstractfactory.ingredientfactories.NYPizzaIngredientFactory;
import org.example.abstractfactory.ingredientfactories.PizzaIngredientFactory;
import org.example.abstractfactory.pizzas.CheezePizza;
import org.example.abstractfactory.pizzas.PepperoniPizza;
import org.example.abstractfactory.pizzas.Pizza;

public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        if(type.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("NY Style Pepperoni Pizza");
        } else {
            pizza = new CheezePizza(ingredientFactory);
            pizza.setName("NY Style Cheeze Pizza");
        }
        return pizza;
    }
}
