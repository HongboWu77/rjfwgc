package com.wentun.rjfw.developer01api.api;

import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author xiaobai
 * @create 2024-03-27-
 */
@Component
@FeignClient(value = "developer01-web")
@LoadBalancerClient(value = "article", configuration = LoadBalancerClient.class) //指定负载均衡策略为随机
public interface Developer01Client {
    String PREFIX = "/feign";

    @GetMapping(PREFIX + "/developer01Test")
    String developer01Test();
}
