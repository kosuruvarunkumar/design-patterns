package org.example.abstractfactory.ingredientfactories;

import org.example.abstractfactory.ingredients.*;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new ThinCrustDough();
    }

    public Sauce createSauce() {
        return new TomatoSauce();
    }

    public Cheeze createCheese() {
        return new MozzarellaCheeze();
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Veggie[] createVeggies() {
        Veggie[] veggies = {new BellPepper(), new Olive()};
        return veggies;
    }
}
