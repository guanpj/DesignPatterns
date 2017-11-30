package com.guanpj.designpattern.chapter4.factorymethod;

public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new NYStyleCheesePizza();
        }  else if (item.equals("clam")) {
            return new NYStyleClamPizza();
        }  else return null;
    }
}
