package com.guanpj.designpattern.chapter4.abstractfactory;

import com.guanpj.designpattern.chapter4.abstractfactory.pizza.ChicagoPizzaStore;
import com.guanpj.designpattern.chapter4.abstractfactory.pizza.NYPizzaStore;
import com.guanpj.designpattern.chapter4.abstractfactory.pizza.Pizza;
import com.guanpj.designpattern.chapter4.abstractfactory.pizza.PizzaStore;

public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza + "\n");

        pizza = nyStore.orderPizza("clam");
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza("clam");
        System.out.println("Joel ordered a " + pizza + "\n");

        pizza = nyStore.orderPizza("veggie");
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza("veggie");
        System.out.println("Joel ordered a " + pizza + "\n");
    }
}
