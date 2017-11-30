package com.guanpj.designpattern.chapter4.abstractfactory;

import com.guanpj.designpattern.chapter4.abstractfactory.material.cheese.Cheeses;
import com.guanpj.designpattern.chapter4.abstractfactory.material.clam.Clams;
import com.guanpj.designpattern.chapter4.abstractfactory.material.veggie.Veggies;

public interface PizzaIngredientFactory {
    public Cheeses createCheeses();
    public Veggies[] createVeggies();
    public Clams createClams();
}
