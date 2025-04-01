package org.example.abstractfactory.ingredientfactories;

import org.example.abstractfactory.ingredients.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new ThickCrustDough();
    }

    public Sauce createSauce() {
        return new GarlicSauce();
    }

    public Cheeze createCheese() {
        return new ParmesanCheeze();
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Veggie[] createVeggies() {
        Veggie[] veggies = {new Olive()};
        return veggies;
    }
}
