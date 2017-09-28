package com.demo.mbatis2.model;

import com.alibaba.fastjson.JSON;

public class User {
    private Long id;
    private Long tenantId;

    private String token;
    private String nickName;

    private String avatar;

    public User(Long id, Long tenantId, String token, String nickName, String avatar) {
        this.id = id;
        this.tenantId = tenantId;
        this.token = token;
        this.nickName = nickName;
        this.avatar = avatar;
    }

    public User() {

    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTenantId() {
        return tenantId;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
