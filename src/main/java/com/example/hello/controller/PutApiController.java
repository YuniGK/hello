package com.example.hello.controller;

import com.example.hello.dto.PutRequestDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/put")
public class PutApiController {
    /*
      {
       "name": "",
       "age": ,
       "car_list": [
            {
                "name": "",
                "car_number": ""
            },
            {
                "name": "",
                "car_number": ""
            },
       ]
      }
    */
    @PutMapping("/put")
    public PutRequestDto put(@RequestBody PutRequestDto putRequestDto){
        System.out.println("putRequestDto = " + putRequestDto);
        System.out.println(putRequestDto.toString());

        return putRequestDto;
    }

    @PutMapping("/put/{userId}")
    public PutRequestDto putUserId(@RequestBody PutRequestDto putRequestDto,
                                   @PathVariable(name = "userId") Long id){

        System.out.println("id = " + id);
        System.out.println(putRequestDto.toString());

        return putRequestDto;
    }
}
