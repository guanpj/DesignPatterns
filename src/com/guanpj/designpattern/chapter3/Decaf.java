package com.guanpj.designpattern.chapter3;

public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf Coffee";
    }

    @Override
    protected double cost() {
        return 1.05;
    }
}