package com.wentun.rjfw.developer02web.controller;

import com.wentun.rjfw.developer02web.service.Developer02Service;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaobai
 * @create 2024-03-27-
 */
@RestController
@RequestMapping("/developer02")
@AllArgsConstructor
public class Developer02Controller {

    private final Developer02Service developer02Service;

    @GetMapping("/developer02Test")
    public String developer01Test(){
        return "developer02-->"+developer02Service.developer02Test();
    }

}
