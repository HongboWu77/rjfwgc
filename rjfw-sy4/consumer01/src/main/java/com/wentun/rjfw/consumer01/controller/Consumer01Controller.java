package com.wentun.rjfw.consumer01.controller;

import com.wentun.rjfw.consumer01.service.Consumer01Service;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaobai
 * @create 2024-03-27-
 */
@RestController
@AllArgsConstructor
@RequestMapping("/consumer01")
public class Consumer01Controller {

    private final Consumer01Service consumer01Service;

    @GetMapping("/consumer01TestDeveloper01")
    public String consumer01TestDeveloper01(){
        return "consumer01-->"+consumer01Service.consumer01TestDeveloper01();
    }

    @GetMapping("/consumer01TestDeveloper02")
    public String consumer01TestDeveloper02(){
        return "consumer01-->"+consumer01Service.consumer01TestDeveloper02();
    }

}
