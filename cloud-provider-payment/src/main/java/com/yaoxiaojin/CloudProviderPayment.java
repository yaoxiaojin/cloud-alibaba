package com.yaoxiaojin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 服务提供者-支付服务
 *
 * @author yaoxiaojin
 */
@EnableDiscoveryClient
@SpringBootApplication
public class CloudProviderPayment {
    public static void main(String[] args) {
        SpringApplication.run(CloudProviderPayment.class, args);
    }
}
