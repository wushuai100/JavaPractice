package com.smart.test;

import java.io.StringReader;
import java.io.StringWriter;

/**
 * Created by wushuai3 on 2016/9/12.
 */
public class StringNodeTest {
    public static void main(String[] args){
        try {
            String src = "多发点的发生大发多发点防守打法地方地方地方大幅度法第三方第三方第三方第三方\n"
                    +"地方地方大幅度的方地方地方";
            char[] buffer = new char[32];
            int hasRead = 0;
            StringReader sr = new StringReader(src);
            while((hasRead = sr.read(buffer))>0){
                System.out.println(new String(buffer,0,hasRead));
            }
        } catch (Exception ee) {
            ee.printStackTrace();
        }
        StringWriter sw = new StringWriter();
        sw.write("sd大方地方地方,\n");
        sw.write("sd大方地方地方,\n");
        sw.write("sd大方地方地方,\n");
    }
}
