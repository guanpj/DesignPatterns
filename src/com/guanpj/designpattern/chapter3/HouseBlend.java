package com.guanpj.designpattern.chapter3;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "HouseBlend";
    }

    @Override
    protected double cost() {
        return .89;
    }
}
