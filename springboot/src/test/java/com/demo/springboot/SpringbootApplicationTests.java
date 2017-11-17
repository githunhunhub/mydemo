package com.demo.springboot;

import com.demo.springboot.model.User;
import com.demo.springboot.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Time;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootApplicationTests {

	@Autowired
	private UserService userService;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testAdd(){
		Time time = Time.valueOf("12:14:13");
		User user = new User(11L, "asdfa", time);
		userService.add(user);
	}

	@Test
	public void testGet(){
		User user = userService.findOne(1L);
		System.out.println(user);
	}
}
