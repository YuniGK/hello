package com.example.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//REST API 처리하는 컨트롤러
@RestController
//URL를 지정해주는 어너테이션
@RequestMapping("/api")
public class ApiController {

    //http://localhost:8080/api/hello
    @GetMapping("/hello")
    public String hello(){
        return "Hello Spring Boot";
    }

}
