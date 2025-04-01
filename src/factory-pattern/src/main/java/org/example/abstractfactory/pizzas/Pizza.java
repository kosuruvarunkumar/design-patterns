package org.example.abstractfactory.pizzas;

import org.example.abstractfactory.ingredients.*;

public abstract class Pizza {
    String name;

    Dough dough;
    Veggie[] veggies;
    Sauce sauce;
    Cheeze cheeze;
    Pepperoni pepperoni;

    public abstract void prepare();

    public void bake() {
        System.out.println("Baking for 15 min at 400");
    }

    public void cut() {
        System.out.println("Cutting the pizza into slices");
    }

    public void box() {
        System.out.println("Place the pizza in the official pizza box");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("---- " + name + " ----\n");
        if (dough != null) {
            result.append(dough);
            result.append("\n");
        }
        if (sauce != null) {
            result.append(sauce);
            result.append("\n");
        }
        if (cheeze != null) {
            result.append(cheeze);
            result.append("\n");
        }
        if (veggies != null) {
            for (int i = 0; i < veggies.length; i++) {
                result.append(veggies[i]);
                if (i < veggies.length-1) {
                    result.append(", ");
                }
            }
            result.append("\n");
        }
        if (pepperoni != null) {
            result.append(pepperoni);
            result.append("\n");
        }
        return result.toString();
    }


}
