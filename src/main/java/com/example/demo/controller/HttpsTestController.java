package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author grassPrince
 * @Date 2020/7/13 15:37
 * @Description TODO
 **/
@RestController
@RequestMapping("httpsTestController")
public class HttpsTestController {

    // 测试https接口   https://localhost:9090/servicer-example/httpsTestController/testGet?message=456
    @GetMapping("testGet")
    public String testGet(@RequestParam("message") String message) {
        System.out.println("sfd" + message);
        return "haha";
    }
}
