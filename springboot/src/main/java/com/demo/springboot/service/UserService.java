package com.demo.springboot.service;

import com.demo.springboot.model.User;
import com.demo.springboot.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created on 2017/10/20
 **/

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    public User findOne(Long id){
        return userRepo.findOne(id);
    }

    public void add(User user){
        userRepo.save(user);
    }
}
