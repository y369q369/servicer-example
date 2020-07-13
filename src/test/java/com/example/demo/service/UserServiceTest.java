package com.example.demo.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.entity.User;
import com.example.demo.service.impl.UserServiceImpl;
import com.example.demo.utils.CommonUtil;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
class UserServiceTest {

    @Autowired(required = false)
    private UserServiceImpl userService;

    @Test
    void save() {
        User user = new User(CommonUtil.generateUUID(), "dragon", "dragon", LocalDateTime.now(), 1);
        Boolean saveFlag = userService.save(user);
        System.out.println(saveFlag);
    }

    @Test
    void List() {
        List<User> userList = userService.list();
        System.out.println(userList);
    }

    @Test
    void QueryWrapperTests() {
        // 条件构造器的使用
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("delete_flag", 1);
        List<User> userList1 = userService.list(queryWrapper);

        QueryWrapper<User> queryWrapper2 = new QueryWrapper<>();
        queryWrapper2.eq("delete_flag", 0);
        queryWrapper2.eq("name", "cc");
        List<User> userList2 = userService.list(queryWrapper2);

        System.out.println(userList1);
        System.out.println(userList2);
    }

}