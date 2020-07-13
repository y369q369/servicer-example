package com.example.demo.entity;

import lombok.Data;

import java.sql.Date;

/**
 * @Author grassPrince
 * @Date 2020/7/13 17:25
 * @Description 用户表
 **/
@Data
public class User {

    private Long id;
    private String name;
    private String pwd;
    private Date accessTime;
    private Integer deleteFlag;

    public User(Long id, String name, String pwd, Date accessTime, Integer deleteFlag) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
        this.accessTime = accessTime;
        this.deleteFlag = deleteFlag;
    }

    public User() {
    }
}
