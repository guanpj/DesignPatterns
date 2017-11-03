package com.guanpj.designpattern.chapter1;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.print("Squeak");
    }
}
