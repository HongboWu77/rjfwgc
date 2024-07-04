package com.wentun.rjfw.consumer01.controller;

import com.wentun.rjfw.consumer01.service.Consumer01Service;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaobai
 * @create 2024-03-27-
 */
@RestController
@RequestMapping("/consumer01")
@RefreshScope
public class Consumer01Controller {

    @Autowired
    private Consumer01Service consumer01Service;

    @Value("${my.name}")
    private String name;

    @GetMapping("/consumer01TestDeveloper01")
    public String consumer01TestDeveloper01(){
        return "consumer01-->"+consumer01Service.consumer01TestDeveloper01();
    }

    @GetMapping("/consumer01TestDeveloper02")
    public String consumer01TestDeveloper02(){
        return "consumer01-->"+consumer01Service.consumer01TestDeveloper02();
    }

    @GetMapping("/getName")
    public String getName(){
        return name;
    }

}
