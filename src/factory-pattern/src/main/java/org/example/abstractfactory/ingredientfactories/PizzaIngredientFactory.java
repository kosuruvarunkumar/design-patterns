package org.example.abstractfactory.ingredientfactories;

import org.example.abstractfactory.ingredients.*;

public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheeze createCheese();
    Pepperoni createPepperoni();
    Veggie[] createVeggies();
}
