package com.yaoxiaojin.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 网关服务
 *
 * @author yaoxiaojin
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudGateWay {
    public static void main(String[] args) {
        SpringApplication.run(CloudGateWay.class, args);
    }
}
