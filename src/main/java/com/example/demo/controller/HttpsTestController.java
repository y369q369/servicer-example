package com.example.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * @Author grassPrince
 * @Date 2020/7/13 15:37
 * @Description TODO
 **/
@Api(tags = {"https测试"})
@RestController
@RequestMapping("httpsTest")
public class HttpsTestController {

    // 测试https接口   https://localhost:9090/servicer-example/httpsTestController/testGetMethod?message=456
    @GetMapping("testGetMethod")
    @ApiOperation(value = "testGetMethod", notes = "get接口测试")
    public String testGetMethod(String message) {
        System.out.println("sfd" + message);
        return "haha";
    }

    @GetMapping("getUser")
    public String getUser() {
        return "user";
    }
}
