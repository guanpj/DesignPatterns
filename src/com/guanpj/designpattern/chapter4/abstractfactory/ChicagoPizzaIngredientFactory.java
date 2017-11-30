package com.guanpj.designpattern.chapter4.abstractfactory;

import com.guanpj.designpattern.chapter4.abstractfactory.material.cheese.Cheeses;
import com.guanpj.designpattern.chapter4.abstractfactory.material.cheese.MozzarellaCheese;
import com.guanpj.designpattern.chapter4.abstractfactory.material.clam.Clams;
import com.guanpj.designpattern.chapter4.abstractfactory.material.clam.FrozenClams;
import com.guanpj.designpattern.chapter4.abstractfactory.material.veggie.BlackOlives;
import com.guanpj.designpattern.chapter4.abstractfactory.material.veggie.Eggplant;
import com.guanpj.designpattern.chapter4.abstractfactory.material.veggie.Veggies;

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
