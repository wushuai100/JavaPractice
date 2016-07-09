package com.smart.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

/**
 * Created by wushuai3 on 2016/7/8.
 */
public class SystemTest {
    public static void main(String[] args){
        Map<String,String> env = System.getenv();
        for(String name: env.keySet()){
            System.out.println(name+"--->"+env.get(name));
        }
        System.out.println(System.getenv("JAVA_HOME"));
        Properties props = System.getProperties();
        try {
            props.store(new FileOutputStream("props.txt"),"System Properties");
        } catch (IOException e) {
            e.printStackTrace();
        }
//        System.out.println(System.getProperties("os.name"));


    }
}
