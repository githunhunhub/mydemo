package com.test;

import com.test.util.SexEnum;

/**
 * Created on 2017/10/18
 **/

public class EnumTest {
    public static void main(String[] args) {
        System.out.println(SexEnum.getType(1).getName());
        System.out.println(SexEnum.valueOf("female"));
    }
}
