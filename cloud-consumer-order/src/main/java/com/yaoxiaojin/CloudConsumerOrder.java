package com.yaoxiaojin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 服务提供者-订单服务
 *
 * @author yaoxiaojin
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class CloudConsumerOrder {
    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerOrder.class, args);
    }
}
