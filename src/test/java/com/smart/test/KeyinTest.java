//package com.smart.test;
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
///**
// * Created by wushuai3 on 2016/9/12.
// */
//public class KeyinTest
//{
//    public static void main(String[] args)
//    {try
////        (
//////                // 将Sytem.in对象转换成Reader对象
//////                InputStreamReader reader = new InputStreamReader(new FileReader("D:\\JavaProject\\SpringAop\\110.txt"));
//////                // 将普通Reader包装成BufferedReader
//////                BufferedReader br = new BufferedReader(reader)
////        )
//        {
//            long startTime = System.currentTimeMillis();
//            BufferedReader br = new BufferedReader(new FileReader("D:\\JavaProject\\SpringAop\\110.txt"));
//
//            String line = null;
//            int lineCount = 0;
//
//            // 采用循环方式来一行一行的读取
//            while ((line = br.readLine()) != null)
//            {
//                // 如果读取的字符串为"exit"，程序退出
//                lineCount ++;
//                if (line.equals("吴帅"))
//                {
//                    System.out.println(lineCount);
//                    long endTime = System.currentTimeMillis();
//                    long runTime = endTime - startTime;
//                    System.out.println(runTime);
//
//                }
//                // 打印读取的内容
////                System.out.println("输入内容为:" + line);
//
//            }
//
//        }
//        catch (IOException ioe)
//        {
//            ioe.printStackTrace();
//        }
//    }
//}
