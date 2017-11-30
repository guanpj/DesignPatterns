package com.guanpj.designpattern.chapter4.abstractfactory;

import com.guanpj.designpattern.chapter4.abstractfactory.material.cheese.Cheeses;
import com.guanpj.designpattern.chapter4.abstractfactory.material.cheese.ReggianoCheese;
import com.guanpj.designpattern.chapter4.abstractfactory.material.clam.Clams;
import com.guanpj.designpattern.chapter4.abstractfactory.material.clam.FreshClams;
import com.guanpj.designpattern.chapter4.abstractfactory.material.veggie.Garlic;
import com.guanpj.designpattern.chapter4.abstractfactory.material.veggie.Onion;
import com.guanpj.designpattern.chapter4.abstractfactory.material.veggie.Veggies;

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
