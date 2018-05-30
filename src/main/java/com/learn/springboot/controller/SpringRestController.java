package com.learn.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringRestController {

    @GetMapping("/")
    public String hello(){
        return "Hello Bhagavan !";
    }

    @GetMapping("/list")
    public String getList()
    {
        return "list";
    }
}
