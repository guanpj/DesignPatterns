package com.guanpj.designpattern.chapter1;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.print("<< Slience >>");
    }
}
