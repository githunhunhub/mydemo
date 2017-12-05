package com.test.bigdecimal;

import org.junit.Test;

import java.math.BigDecimal;

/**
 * Created by zgg on 2017/11/24
 **/

public class BigDecimalTest {
    @Test
    public void addTest() {
        BigDecimal a = new BigDecimal("100");
        BigDecimal b = new BigDecimal(100);
        BigDecimal c = new BigDecimal("1.555");
        BigDecimal d = new BigDecimal("-2.555555");
        System.out.println("b + c = " + b.add(c));
        System.out.println("a + c = " + a.add(c).setScale(2, BigDecimal.ROUND_HALF_UP));
        System.out.println("a + d = " + a.add(d));
        System.out.println("a + d = " + a.add(d).setScale(2, BigDecimal.ROUND_HALF_UP));
        System.out.println("b - c = " + b.subtract(c));
        System.out.println("a - c = " + a.subtract(c).setScale(2, BigDecimal.ROUND_HALF_UP));
        System.out.println("b * c = " + b.multiply(c));
        System.out.println("a * c = " + a.multiply(c).setScale(2, BigDecimal.ROUND_HALF_UP));
        System.out.println("a / c = " + a.divide(c, BigDecimal.ROUND_HALF_UP));
        System.out.println("b / c = " + b.divide(c, 2, BigDecimal.ROUND_HALF_UP));

    }
}
