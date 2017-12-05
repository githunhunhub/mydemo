package com.demo.springboot.repo;

import com.demo.springboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created on 2017/10/20
 **/
@Repository
public interface UserRepo extends JpaRepository<User, Long> {
}
