package com.guanpj.designpattern.chapter5.dcl;

public class Singleton {
    private volatile static Singleton mInstance;
    private Singleton() {}

    public static Singleton getInstance() {
        if (mInstance == null) {
            synchronized (Singleton.class) {
                if(mInstance == null) {
                    mInstance = new Singleton();
                }
            }
        }
        return mInstance;
    }
}
