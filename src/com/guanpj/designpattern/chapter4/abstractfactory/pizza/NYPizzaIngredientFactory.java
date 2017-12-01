package com.guanpj.designpattern.chapter4.abstractfactory.pizza;

import com.guanpj.designpattern.chapter4.abstractfactory.ingredient.cheese.Cheeses;
import com.guanpj.designpattern.chapter4.abstractfactory.ingredient.cheese.ReggianoCheese;
import com.guanpj.designpattern.chapter4.abstractfactory.ingredient.clam.Clams;
import com.guanpj.designpattern.chapter4.abstractfactory.ingredient.clam.FreshClams;
import com.guanpj.designpattern.chapter4.abstractfactory.ingredient.veggie.Garlic;
import com.guanpj.designpattern.chapter4.abstractfactory.ingredient.veggie.Onion;
import com.guanpj.designpattern.chapter4.abstractfactory.ingredient.veggie.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Cheeses createCheeses() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = { new Garlic(), new Onion() };
        return veggies;
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }
}
