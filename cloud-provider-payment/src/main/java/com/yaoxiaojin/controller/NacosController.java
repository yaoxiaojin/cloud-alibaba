package com.yaoxiaojin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试nacos配置功能
 *
 * @author yaoxiaojin
 */
@RestController
public class NacosController {

    @Value("${name}")
    private String name;

    @GetMapping(value = "/nacos/config")
    public String getPayment() {
        return name;
    }
}
