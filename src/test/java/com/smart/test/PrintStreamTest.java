package com.smart.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 * Created by wushuai3 on 2016/9/12.
 */
public class PrintStreamTest {
    public static void main(String[] args){
        try {
            FileOutputStream fos = new FileOutputStream("test.txt");
            PrintStream ps = new PrintStream(fos);
            ps.println("普通字符串");
            ps.println(new PrintStreamTest());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
