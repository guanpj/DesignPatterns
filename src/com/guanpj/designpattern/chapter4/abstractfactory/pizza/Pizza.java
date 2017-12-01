package com.guanpj.designpattern.chapter4.abstractfactory.pizza;

import com.guanpj.designpattern.chapter4.abstractfactory.ingredient.cheese.Cheeses;
import com.guanpj.designpattern.chapter4.abstractfactory.ingredient.clam.Clams;
import com.guanpj.designpattern.chapter4.abstractfactory.ingredient.veggie.Veggies;

public abstract class Pizza {
    protected String name;
    protected Veggies veggies[];
    protected Cheeses cheese;
    protected Clams clam;

    protected abstract void prepare();

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("---- " + name + " ----\n");
        if (cheese != null) {
            result.append(cheese);
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
        if (clam != null) {
            result.append(clam);
            result.append("\n");
        }
        return result.toString();
    }
}

