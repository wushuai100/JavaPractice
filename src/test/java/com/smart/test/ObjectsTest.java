package com.smart.test;

import java.util.Objects;

/**
 * Created by wushuai3 on 2016/7/9.
 */
public class ObjectsTest {
//    static ObjectsTest obj;
    public static void main(String[] args){
        int a = MurmurHash.hash("222222111111");
        int mod = Math.abs(a%100);
        System.out.println(mod);


    }


}

