package com.demo.mbatis.mapper;

import com.demo.mbatis.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void findUserNameLike() throws Exception {
        List<User> users = userMapper.findUserNameLike("%3%");
        System.out.println(users);
    }

    @Test
    public void findOne() throws Exception {
        User user = userMapper.findOne(703L);
        System.out.println(user);
    }

    @Test
    public void update() throws Exception {
        userMapper.update(null, "233333", 703L);
    }

    @Test
    public void delete() throws Exception {
        userMapper.delete(701L);
    }

    @Test
    public void add() throws Exception {
        userMapper.add(new User(701L, 123L, "", "adfadf", "dadf"));
        userMapper.add(new User(702L, 123L, "", "fsg", "sfht"));
        userMapper.add(new User(703L, 123L, "", "sgerg", "rgggg"));
    }

}