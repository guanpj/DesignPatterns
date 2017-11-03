package com.guanpj.designpattern.chapter1;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.print("Quack");
    }
}
