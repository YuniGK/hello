package com.example.hello.controller;

import com.example.hello.dto.PostRequestDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/post")
public class PostApiController {

    @PostMapping("/post")
    //RequestBody - view에서 서버로 필요한 데이터를 요청 json형식으로 서버로 보낸다.
    public void post(@RequestBody Map<String, Object> requestData){
        requestData.entrySet().forEach(stringObjectEntry -> {
            System.out.println("key = " + stringObjectEntry.getKey());
            System.out.println("value = " + stringObjectEntry.getValue());
        });

        requestData.forEach((key, value) -> {
            System.out.println("key = " + key);
            System.out.println("value = " + value);
        });
    }

    @PostMapping("/post-dto")
    public void postDto(@RequestBody PostRequestDto postRequestDto){
        System.out.println(postRequestDto.toString());
    }

}
