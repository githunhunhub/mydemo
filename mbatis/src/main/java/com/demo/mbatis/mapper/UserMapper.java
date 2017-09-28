package com.demo.mbatis.mapper;

import com.demo.mbatis.model.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created on 2017/9/25
 **/

public interface UserMapper {

    @Select("SELECT * FROM im_user WHERE nickname LIKE #{like}")
    @Results({
            @Result(column = "tenant_id", property = "tenantId"),
            @Result(column = "nickname", property = "nickName")
    })
    List<User> findUserNameLike(String like);

    @Select("SELECT * FROM im_user WHERE id = #{id}")
    @Results({
            @Result(column = "tenant_id", property = "tenantId"),
            @Result(column = "nickname", property = "nickName")
    })
    User findOne(Long id);

    //在没有指定@Param的时候，mybatis会到User里边找属性，由于传过来的是String、Long等对象，不是User对象，会报属性绑定的错误
    //解决方法：①直接传User对象 ②用 @Param 指定参数
    @Update("UPDATE im_user SET token = #{token1, jdbcType=VARCHAR}, nickname = #{nickName1} WHERE id = #{id}")
    void update(@Param("token1") String token1, @Param("nickName1") String nickName1, @Param("id") Long id);

    @Delete("DELETE FROM im_user WHERE id = #{id}")
    void delete(Long id);

    @Insert("INSERT INTO im_user(id, tenant_id, token, nickname, avatar) VALUES (#{id}, #{tenantId}, #{token}, #{nickName}, #{avatar})")
    void add(User user);
}
