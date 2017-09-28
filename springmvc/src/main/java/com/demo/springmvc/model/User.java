package com.demo.springmvc.model;

/**
 * Created on 2017/9/8
 **/

public class User {
    private int id;
    private String name;
    private String gender;
    private Integer age;

    public User() {
    }

    public User(int id, String name, String gender, Integer age) {

        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
