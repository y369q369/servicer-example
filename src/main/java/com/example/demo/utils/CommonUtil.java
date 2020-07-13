package com.example.demo.utils;

import java.util.UUID;

/**
 * 通用混合工具类
 */
public class CommonUtil {

    /**
     * 生成32位UUID
     */
    public static String generateUUID() {
        return UUID.randomUUID().toString().replace("-", "").toLowerCase();
    }

}
