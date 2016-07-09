package com.smart.test;

/**
 * Created by wushuai3 on 2016/7/9.
 */
public class User implements Cloneable {
    int age;
    Address address;
    public User(int age){
        this.age = age;
        address = new Address("广州天河");

    }
    public User clone() throws CloneNotSupportedException{
        return (User)super.clone();
    }
}

class CloneTest{
    public static void main(String[] args)throws CloneNotSupportedException{
        User u1 = new User(29);
        User u2 = u1.clone();
        System.out.println(u1==u2);
        System.out.println(u1.address == u2.address);
    }


}
