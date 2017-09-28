package com.demo.mbatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.demo.mbatis.mapper")
public class MbatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(MbatisApplication.class, args);
	}
}
