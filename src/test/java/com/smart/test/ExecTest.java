package com.smart.test;

/**
 * Created by wushuai3 on 2016/7/9.
 */
public class ExecTest {
    public static void main(String[] args) throws Exception{
        Runtime rt = Runtime.getRuntime();
        rt.exec("notepad.exe");
    }
}
