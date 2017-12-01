package com.guanpj.designpattern.chapter4.abstractfactory.pizza;

public class CheesePizza extends Pizza{
    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        veggies = ingredientFactory.createVeggies();
        cheese = ingredientFactory.createCheeses();
    }
}
