package com.guanpj.designpattern.chapter4.abstractfactory.pizza;

import com.guanpj.designpattern.chapter4.abstractfactory.Pizza;
import com.guanpj.designpattern.chapter4.abstractfactory.PizzaIngredientFactory;

public class VeggiePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        cheese = ingredientFactory.createCheeses();
        veggies = ingredientFactory.createVeggies();
    }
}
