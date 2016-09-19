package com.smart.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * Created by Administrator on 2016/9/18.
 */
public class RedirectOut {
    public static void main(String[] args){
        try {
            PrintStream ps = new PrintStream(new FileOutputStream("out.txt"));
            System.setOut(ps);
            System.out.println("是的范德萨发的");
            System.out.println(new RedirectOut());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
