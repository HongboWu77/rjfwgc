package com.wentun.rjfw.consumer02.controller;

import com.wentun.rjfw.consumer02.service.Consumer02Service;
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
@RequestMapping("/consumer02")
public class Consumer02Controller {

    private final Consumer02Service consumer02Service;

    @GetMapping("/consumer02TestDeveloper01")
    public String consumer02TestDeveloper01(){
        return "consumer02-->"+consumer02Service.consumer02TestDeveloper01();
    }

    @GetMapping("/consumer02TestDeveloper02")
    public String consumer02TestDeveloper02(){
        return "consumer02-->"+consumer02Service.consumer02TestDeveloper02();
    }

}
