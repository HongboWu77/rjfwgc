package com.wentun.rjfw.developer02api.api;

import com.wentun.rjfw.developer02api.fallback.Developer02ClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author xiaobai
 * @create 2024-03-27-
 */
@Component
@FeignClient(value = "developer02-web", fallback = Developer02ClientFallback.class)
public interface Developer02Client {
    String PREFIX = "/feign";

    @GetMapping(PREFIX + "/developer02Test")
    String developer02Test();
}
