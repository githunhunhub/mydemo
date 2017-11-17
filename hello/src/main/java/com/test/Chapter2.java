package com.test;

import java.util.Random;

/**
 * Created on 2017/10/10
 **/

public class Chapter2 {
    private int age;
    private char sex;

    public static void main(String[] args) {
        Chapter2 chap = new Chapter2();
        System.out.println(chap.age);
        System.out.println(chap.sex + "*");
        System.out.println("------------");

        Random random = new Random(4);
        System.out.println(random.nextInt(100));
        System.out.println(random.nextInt(100));

    }
}
