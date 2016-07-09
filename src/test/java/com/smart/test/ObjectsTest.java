package com.smart.test;

import java.util.Objects;

/**
 * Created by wushuai3 on 2016/7/9.
 */
public class ObjectsTest {
    static ObjectsTest obj;
    public static void main(String[] args){
        System.out.println(Objects.hashCode(obj));
        System.out.println(Objects.toString(obj));
//        System.out.println(Objects.requireNonNull(obj));
    }

}

