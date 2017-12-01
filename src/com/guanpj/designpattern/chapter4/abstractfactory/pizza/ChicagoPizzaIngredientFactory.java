package com.guanpj.designpattern.chapter4.abstractfactory.pizza;

import com.guanpj.designpattern.chapter4.abstractfactory.ingredient.cheese.Cheeses;
import com.guanpj.designpattern.chapter4.abstractfactory.ingredient.cheese.MozzarellaCheese;
import com.guanpj.designpattern.chapter4.abstractfactory.ingredient.clam.Clams;
import com.guanpj.designpattern.chapter4.abstractfactory.ingredient.clam.FrozenClams;
import com.guanpj.designpattern.chapter4.abstractfactory.ingredient.veggie.BlackOlives;
import com.guanpj.designpattern.chapter4.abstractfactory.ingredient.veggie.Eggplant;
import com.guanpj.designpattern.chapter4.abstractfactory.ingredient.veggie.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Cheeses createCheeses() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = { new BlackOlives(), new Eggplant() };
        return veggies;
    }

    @Override
    public Clams createClams() {
        return new FrozenClams();
    }
}
