package com.wentun.rjfw.developer01web.controller;

import com.wentun.rjfw.developer01web.service.Developer01Service;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{id}")
    public Integer getUserById(@PathVariable Integer id) {
        // 假设的数据库查询逻辑
        return new Integer(id);
    }

    @PostMapping("/")
    public Integer createUser(@RequestBody Integer id) {
        // 假设的保存用户逻辑
        id = 1; // 假设自动生成的ID
        return id;
    }

    @PutMapping("/{id}")
    public Integer updateUser(@PathVariable Integer id, @RequestBody Integer user) {
        // 假设的更新用户逻辑
        user = id;
        return user;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable Long id) {
        // 假设的删除用户逻辑
        return ResponseEntity.ok().build();
    }

}
