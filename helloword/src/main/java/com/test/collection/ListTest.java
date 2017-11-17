package com.test.collection;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by zgg on 2017/11/17
 **/

public class ListTest {

    @Test
    public void containsAllTest2(){
        List<Integer> list = Arrays.asList(2, 4, 6);
        List<Integer> list1 = new ArrayList<>();

        System.out.println(JSON.toJSONString(list));
        if (list.contains(2)){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
        System.out.println("---------------");
        System.out.println(JSON.toJSONString(list1));
        if (list1.contains(2)){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }

    @Test
    public void containsAllTest() {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> list2 = Arrays.asList(2, 4, 6);
        List<Integer> list3 = Arrays.asList(2, 4, 6, 7);

        if (list1.containsAll(list2)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        if (list1.containsAll(list3)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
