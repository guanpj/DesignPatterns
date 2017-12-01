package com.guanpj.designpattern.chapter4.abstractfactory.pizza;

public class ClamPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        cheese = ingredientFactory.createCheeses();
        clam = ingredientFactory.createClams();
    }
}
