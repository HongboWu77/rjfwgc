package com.wentun.rjfw.developer01web.feign;

import com.wentun.rjfw.developer01api.api.Developer01Client;
import com.wentun.rjfw.developer01web.service.Developer01Service;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaobai
 * @create 2024-03-27-
 */
@RestController
@AllArgsConstructor
public class Developer01FeignController implements Developer01Client {

    private final Developer01Service developer01Service;

    @Override
    public String developer01Test() {
        return "developer01Feign-->"+developer01Service.developer01Test();
    }
}
