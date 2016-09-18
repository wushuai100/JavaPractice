package com.smart.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by wushuai3 on 2016/9/11.
 */
public class FileInputStreamTest {

        public static void main(String[] args)
        {
            try(
                    // 创建字符输入流
                    FileReader fr = new FileReader("D:\\JavaProject\\SpringAop\\src\\test\\java\\com\\smart\\test\\FileInputStreamTest.java"))
            {
                // 创建一个长度为32的“竹筒”
                char[] cbuf = new char[2];
                // 用于保存实际读取的字符数
                int hasRead = 0;
                // 使用循环来重复“取水”过程
                while ((hasRead = fr.read(cbuf)) > 0 )
                {
                    // 取出“竹筒”中水滴（字符），将字符数组转换成字符串输入！
                    System.out.print(new String(cbuf , 0 , hasRead));
                }
            }
            catch (IOException ex)
            {
                ex.printStackTrace();
            }
        }
    }

