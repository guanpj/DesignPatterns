package com.guanpj.designpattern.chapter5.stat;

public class Singleton {
    private static Singleton mInstance = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return mInstance;
    }
}
