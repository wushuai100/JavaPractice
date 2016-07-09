package com.smart.test;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by wushuai3 on 2016/7/9.
 */
public class RandomTest {
    public static void main(String[] args){
        Random rand = new Random();
        System.out.println("rand.nextBoolean():"+rand.nextBoolean());
        byte[] buffer = new byte[16];
        System.out.println(buffer);
        rand.nextBytes(buffer);
        System.out.println(Arrays.toString(buffer));
        System.out.println(rand.nextFloat());
        System.out.println(rand.nextInt(26));
        System.out.println(rand.nextLong());
        Random rand1 = new Random(System.currentTimeMillis());
        ThreadLocalRandom rand3 = ThreadLocalRandom.current();
        int val1 = rand.nextInt(20);
        Double val2 = rand.nextDouble();
    }
}
