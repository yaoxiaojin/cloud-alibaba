package com.yaoxiaojin.controller;

import com.yaoxiaojin.config.NacosConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试nacos配置功能
 *
 * @author yaoxiaojin
 */
@RestController
@RefreshScope
public class NacosController {

    @Autowired
    private NacosConfig nacosConfigProperties;

    @GetMapping("/nacos/config")
    public String getPayment() {
        return nacosConfigProperties.getName();
    }

}
