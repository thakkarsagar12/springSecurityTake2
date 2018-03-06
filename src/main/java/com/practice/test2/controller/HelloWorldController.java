package com.practice.test2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String helloworld() {
     return "hello Worlds";
    }

    @PostMapping("/login")
    public String login() {
        return "login";
    }
}
