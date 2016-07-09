package com.smart.test;
import com.smart.test.Season;
/**
 * Created by wushuai3 on 2016/7/7.
 */
public class TestEverything {
    public static void main(String[] args){
//        out:
//        for (int i=0;i<5;i++){
//            for(int j=0;j<3;j++){
//                System.out.println("I的值"+i+",,,,,J的值"+j);
//                if(j==1){
//                    break out;
//                }
//            }
//        }
//    }
          Season a = Season.getSeason(1);
          System.out.println(a.getName());
          System.out.println(a.getDesc());
}}
