package com.example.thirtyspringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @RequestMapping("/userHello")
    public String userHello() {
        return "userHello";
    }
}
