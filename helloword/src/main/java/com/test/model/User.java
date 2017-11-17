package com.test.model;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * Created by zgg on 2017/11/14
 **/

public class User {
    private String name;
    private Integer age;
    @JSONField(format = "yyyy-MM-dd")
    private Date birth;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }

    public User() {
    }

    public User(String name, Integer age, Date birth) {
        this.name = name;
        this.age = age;
        this.birth = birth;
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {

        return name;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
