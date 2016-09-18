package com.smart.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by wushuai3 on 2016/9/12.
 */
public class FileOutputStreamTest {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("D:\\JavaProject\\SpringAop\\src\\test\\java\\com\\smart\\test\\FileOutputStreamTest.java");
            FileOutputStream fos = new FileOutputStream("newFile.txt");
            byte[] bbuf = new byte[32];
            int hasRead = 0;
            while ((hasRead=fis.read(bbuf))>0){
                fos.write(bbuf,0,hasRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
