package com.test;

/**
 * Created on 2017/10/10
 **/

public class Test {

    public float num(float Q, float q){
        System.out.println("Q: " + Q + " q: " + q);
        float t0 = Q - q;
        t0 = t0 * 100;
        System.out.println(t0);
        int i = Math.round(t0);
        System.out.println(i);
        return i;
    }

    public static void main(String[] args) {
        Test test = new Test();
        float n1 = test.num(0.626f, 0.601f);
    }

}
