package com.server.app.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloContoller {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}