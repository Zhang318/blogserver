package com.example.blogserver.utils;

import java.util.UUID;

/**
 * @author 张鑫
 * @date 2019/12/23 18:52
 * @description
 */
public class GenerateId {
    /**
     * 生成id
     * @return
     */
    public static String getId(){
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
}
