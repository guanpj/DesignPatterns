package com.guanpj.designpattern.chapter4.abstractfactory.pizza;

import com.guanpj.designpattern.chapter4.abstractfactory.ingredient.cheese.Cheeses;
import com.guanpj.designpattern.chapter4.abstractfactory.ingredient.clam.Clams;
import com.guanpj.designpattern.chapter4.abstractfactory.ingredient.veggie.Veggies;

public interface PizzaIngredientFactory {
    public Cheeses createCheeses();
    public Veggies[] createVeggies();
    public Clams createClams();
}
