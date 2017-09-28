package com.demo.mbatis2.mapper;

import com.demo.mbatis2.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created on 2017/9/27
 **/
// 使用 @Mapper 需要为每个Mapper都加，
// 或者直接在启动的的Application文件上加@MapperScan("com.demo.mbatis2.mapper")
@Mapper
public interface UserMapper {

    List<User> findByName(@Param("namelike") String namelike);
    User findOne(Long id);
    void updateUser(@Param("token") String token, @Param("nickname") String nickname, @Param("id") Long id);
    void delUser(@Param("id") Long id);
    void addUser(User user);
}
