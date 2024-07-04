package com.wentun.rjfw.developer01web.controller;

import com.wentun.rjfw.developer01web.service.Developer01Service;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaobai
 * @create 2024-03-27-
 */
@RestController
@RequestMapping("/developer01")
@AllArgsConstructor
public class Developer01Controller {

    private final Developer01Service developer01Service;

    @GetMapping("/developer01Test")
    public String developer01Test(){
        return "developer01-->"+developer01Service.developer01Test();
    }

}
