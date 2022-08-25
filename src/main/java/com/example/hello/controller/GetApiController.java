package com.example.hello.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/get")
public class GetApiController {

    //path를 통해 경로를 명확하게 지정
    @GetMapping(path = "/hello")//http://localhost:8080/api/get/hello
    public String hello(){
        return "get Hello";
    }

    //RequestMapping은 get / post / put / delete 모든 기능이 작동 가
    //@RequestMapping("/hi")
    @RequestMapping(path = "/hi", method = RequestMethod.GET)//method 지정을 통해 어떤 기능인지 선택해준다.
    public String hi(){
        return "get hi";
    }

    //http://localhost:8080/api/get/path-variable/{변하는 값}
    @GetMapping("/path-variable/{name}")
    /* public String pathVariable(@PathVariable(name = "name") String pathName, String name)
     파라미터 값이 중복될 경우 위와 같이 알려준다. */
    public String pathVariable(@PathVariable String name){
        return name;
    }

    //search?q=intellij&rlz=1C5CHFA_enKR1019KR1019&ei=NA0HY-G3LZbM2roPn8aOsA - 쿼리 파라미터

}
