package com.smart.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by wushuai3 on 2016/9/13.
 */
public class FoundMyPin {
    public static void main(String[] args) {
        try {
            long startTime = System.currentTimeMillis();
            BufferedReader br = new BufferedReader(new FileReader("D:\\JavaProject\\SpringAop\\user.txt"));

            String line = null;
            int lineCount = 0;


            while ((line = br.readLine()) != null) {

                lineCount++;
                if (line.equals("jd_73c6c356bac20")) {
                    System.out.println(lineCount);
                    long endTime = System.currentTimeMillis();
                    long runTime = endTime - startTime;
                    System.out.println(runTime);
                }else{
                    System.out.println("找不到对应的Pin");
                }


            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
