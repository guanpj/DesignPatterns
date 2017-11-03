package com.guanpj.designpattern.chapter3;

public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    @Override
    protected double cost() {
        return 1.99;
    }
}
