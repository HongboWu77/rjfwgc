package com.wentun.rjfw.developer01web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author xiaobai
 * @create 2024-03-25-
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Developer01Application {
    public static void main(String[] args) {
        SpringApplication.run(Developer01Application.class, args);
    }
}
