package org.example.abstractfactory.pizzastores;

import org.example.abstractfactory.ingredientfactories.ChicagoPizzaIngredientFactory;
import org.example.abstractfactory.ingredientfactories.NYPizzaIngredientFactory;
import org.example.abstractfactory.ingredientfactories.PizzaIngredientFactory;
import org.example.abstractfactory.pizzas.CheezePizza;
import org.example.abstractfactory.pizzas.PepperoniPizza;
import org.example.abstractfactory.pizzas.Pizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
        if(type.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Chicago Style Pepperoni Pizza");
        } else {
            pizza = new CheezePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheeze Pizza");
        }
        return pizza;
    }
}
