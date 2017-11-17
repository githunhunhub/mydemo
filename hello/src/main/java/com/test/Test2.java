package com.test;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created on 2017/10/27
 **/

public class Test2 {

    @Test
    public void testDistinct(){
        User user1 = new User(1, "abc", 12);
        User user2 = new User(1, "abc", 12);
        User user3 = new User(2, "abc", 12);
        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);

        System.out.println(users);
        System.out.println("************************");
        List<User> users1 = users.stream().distinct().collect(Collectors.toList());
        System.out.println(users1);
    }

    @Test
    public void testFormat(){
        String str = String.format("%09d", 12);
        System.out.println(str);
    }

    @Test
    public void testContains(){
        String str = "[\"holiday\",\"weekend\",\"freeorder\"]";
        System.out.println(str.contains("freeorder"));
    }
}
