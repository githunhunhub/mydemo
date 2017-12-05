package com.test.fastjson;

import com.alibaba.fastjson.JSON;
import com.test.model.User;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Created on 2017/11/1
 **/
public class FastJsonTest {

    public List<User> userList(){
        List<User> users = new ArrayList<>();
        users.add(new User("aaa", 12, new Date()));
        users.add(new User("bbb", 15, new Date()));
        users.add(new User("ccc", 20, new Date()));
        return users;
    }

    @Test
    public void parseTest(){
        List<Integer> ids = Arrays.asList(100, 101, 102);
        String jsonStr = JSON.toJSONString(ids);
        System.out.println(ids);
        System.out.println(jsonStr);
    }

    @Test
    public void dateTest(){
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDate.format(DateTimeFormatter.ISO_DATE));
        System.out.println(localTime);
        System.out.println(localDateTime);
        System.out.println(JSON.toJSONString(localDate));
    }

    @Test
    public void toJsonStringTest(){
        List<User> list = userList();
        String jsonStr = JSON.toJSONString(list);
        System.out.println(list);
        System.out.println(jsonStr);
    }
}
