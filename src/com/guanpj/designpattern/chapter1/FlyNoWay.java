package com.guanpj.designpattern.chapter1;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.print("I cant't fly\n");
    }
}
