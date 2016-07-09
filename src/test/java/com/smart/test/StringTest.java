package com.smart.test;

/**
 * Created by wushuai3 on 2016/7/9.
 */
public class StringTest {
    public static void main(String[] args){
        String s1 = new String("fkit.org");
        System.out.println("s.chatAt(5)"+s1.charAt(5));
        String s2 = new String("fkit.org");
        System.out.println(s1.endsWith(s2));
        System.out.println(s1.equals(s2));
        char[] s3 = {'1','b','d','d','3','4','d','d','d','k','p','f'};
        String s4 = new String("123");
        s4.getChars(1,2,s3,2);
        System.out.println(s4);


    }
}
