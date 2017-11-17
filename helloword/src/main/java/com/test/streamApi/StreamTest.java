package com.test.streamApi;

import com.test.model.User;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zgg on 2017/11/14
 **/

public class StreamTest {
    @Test
    public void testGet(){
        List<User> userList = new ArrayList<User>();
        userList.add(new User("aaa", 16));
        userList.add(new User("bbb", 17));
        userList.add(new User("ccc", 18));
        System.out.println(userList);

        String name = userList.stream()
                .filter(item -> item.getAge() == 18)
                .findFirst()
                .map(User::getName)
                .get();
        System.out.println(name);
    }
}
