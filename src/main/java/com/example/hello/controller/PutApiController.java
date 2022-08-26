package com.example.hello.controller;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/put")
public class PutApiController {

    @PutMapping("/put")

}
