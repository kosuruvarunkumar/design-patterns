package org.example.abstractfactory.pizzas;

import org.example.abstractfactory.ingredientfactories.PizzaIngredientFactory;

public class CheezePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public CheezePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.ingredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        veggies = ingredientFactory.createVeggies();
        cheeze = ingredientFactory.createCheese();
        pepperoni = ingredientFactory.createPepperoni();
    }
}
