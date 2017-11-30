package com.guanpj.designpattern.chapter4.abstractfactory;

import com.guanpj.designpattern.chapter4.abstractfactory.pizza.CheesePizza;
import com.guanpj.designpattern.chapter4.abstractfactory.pizza.ClamPizza;
import com.guanpj.designpattern.chapter4.abstractfactory.pizza.VeggiePizza;

public class NYPizzaStore extends PizzaStore {

    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (item.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        }
        return pizza;
    }
}
