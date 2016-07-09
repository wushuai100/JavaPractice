//package com.smart.advice;
//import  org.springframework.aop.BeforeAdvice;
//import org.springframework.aop.framework.ProxyFactory;
//import org.testng.annotations.*;
//
//import java.nio.file.WatchEvent;
//
///**
// * Created by wushuai3 on 2016/7/2.
// */
//
//
//public class BeforeAdviceTest {
//    private Waiter target;
//    private BeforeAdvice advice;
//    private ProxyFactory pf;
//    @BeforeTest
//    public void init(){
//        target = new NaiveWaiter();
//        advice = new GreetingBeforeAdvice();
//        pf = new ProxyFactory();
//        pf.setTarget(target);
//        pf.addAdvice(advice);
//    }
//    @Test
//    public void beforeAdvice(){
//        Waiter proxy = (Waiter)pf.getProxy();
//        proxy.greetTo("John");
//        proxy.serverTo("Tom");
//    }
//}
