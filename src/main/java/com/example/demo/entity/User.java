package com.example.demo.entity;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @Author grassPrince
 * @Date 2020/7/13 17:25
 * @Description 用户表
 **/
@Data
public class User {

    private String id;
    private String name;
    private String pwd;
    private LocalDateTime accessTime;
    private Integer deleteFlag;

    public User(String id, String name, String pwd, LocalDateTime accessTime, Integer deleteFlag) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
        this.accessTime = accessTime;
        this.deleteFlag = deleteFlag;
    }

    public User() {
    }
}
