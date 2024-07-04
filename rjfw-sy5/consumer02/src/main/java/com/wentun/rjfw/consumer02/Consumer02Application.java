package com.wentun.rjfw.consumer02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author xiaobai
 * @create 2024-03-25-
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.wentun.rjfw.**"})
public class Consumer02Application {
    public static void main(String[] args) {
        SpringApplication.run(Consumer02Application.class, args);
    }
}
