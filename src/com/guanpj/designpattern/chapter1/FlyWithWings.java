package com.guanpj.designpattern.chapter1;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.print("flying with wings\n");
    }
}
