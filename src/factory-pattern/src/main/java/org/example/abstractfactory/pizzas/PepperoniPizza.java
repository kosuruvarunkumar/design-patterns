package org.example.abstractfactory.pizzas;

import org.example.abstractfactory.ingredientfactories.PizzaIngredientFactory;

public class PepperoniPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public PepperoniPizza(PizzaIngredientFactory pizzaIngredientFactory) {
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
