package com.smart.test;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by wushuai3 on 2016/7/9.
 */
public class DateTest {
    public static void main(String[] args){
//        Date d1 = new Date();
//        Date d2 = new Date(System.currentTimeMillis()+100);
//        System.out.println(d2);
//        System.out.println(d1.compareTo(d2));
//        System.out.println(d1.before(d2));
          Calendar c = Calendar.getInstance();
//          System.out.println(c.get(Calendar.YEAR));
//          System.out.println(c.get(Calendar.MONTH));
//        System.out.println(c.get(Calendar.DATE));
        c.set(Calendar.MONTH,13);
        System.out.println(c.getTime());
        c.setLenient(false);
        c.set(Calendar.MONTH,13);
        System.out.println(c.getTime());





    }
}
