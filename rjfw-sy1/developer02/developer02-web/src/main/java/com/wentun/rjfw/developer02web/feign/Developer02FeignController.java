package com.wentun.rjfw.developer02web.feign;

import com.wentun.rjfw.developer02api.api.Developer02Client;
import com.wentun.rjfw.developer02web.service.Developer02Service;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaobai
 * @create 2024-03-27-
 */
@RestController
@AllArgsConstructor
public class Developer02FeignController implements Developer02Client {

    private final Developer02Service developer02Service;

    @Override
    public String developer02Test() {
        return "developer02Feign-->"+developer02Service.developer02Test();
    }
}
