package com.wentun.rjfw.developer01api.api;

import com.wentun.rjfw.developer01api.fallback.Developer01ClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author xiaobai
 * @create 2024-03-27-
 */
@Component
@FeignClient(value = "developer01-web", fallback = Developer01ClientFallback.class)
public interface Developer01Client {
    String PREFIX = "/feign";

    @GetMapping(PREFIX + "/developer01Test")
    String developer01Test();
}
