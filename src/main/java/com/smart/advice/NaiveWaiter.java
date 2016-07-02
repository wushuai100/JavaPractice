package com.smart.advice;

/**
 * Created by wushuai3 on 2016/7/2.
 */
public class NaiveWaiter implements Waiter{

    public void greetTo(String name) {
        System.out.println("greet to"+name+"...");
    }

    public void serverTo(String name) {
       System.out.println("serving"+name+"...");
    }
}
