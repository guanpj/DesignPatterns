package com.guanpj.designpattern.chapter3;

public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    protected abstract double cost();
}
