package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("/hello-spring")    // 연결 url
    @ResponseBody
    public String helloSpring(){
        return "Hello-word-spring";
    }
}
