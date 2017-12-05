package com.demo.springboot.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Time;

/**
 * Created on 2017/10/20
 **/

@Entity
@Table(name = "z_user")
public class User {
    @Id
    private Long id;
    private String name;
    private Time time;

    public User() {
    }

    public User(Long id, String name, Time time) {
        this.id = id;
        this.name = name;
        this.time = time;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
