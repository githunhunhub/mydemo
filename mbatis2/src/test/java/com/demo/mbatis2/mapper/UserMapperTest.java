package com.demo.mbatis2.mapper;

import com.demo.mbatis2.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created on 2017/9/27
 **/
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserMapperTest {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void findByName() throws Exception {
        List<User> users = userMapper.findByName("g");
        System.out.println(users);
    }

    @Test
    public void findOne() throws Exception {
        User user = userMapper.findOne(705L);
        System.out.println(user);
    }

    @Test
    public void updateUser() throws Exception {
        userMapper.updateUser(null, "1111111", 705L);
    }

    @Test
    public void delUser() throws Exception {
        userMapper.delUser(704L);
    }

    @Test
    public void addUser() throws Exception {
        userMapper.addUser(new User(704L, 123L, "", "adfadf", "dadf"));
        userMapper.addUser(new User(705L, 123L, "", "fsg", "sfht"));
        userMapper.addUser(new User(706L, 123L, null, "sgerg", "rgggg"));
    }

}