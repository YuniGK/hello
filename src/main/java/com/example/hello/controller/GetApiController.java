package com.example.hello.controller;

import com.example.hello.dto.UserRequest;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

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
    //http://localhost:8080/api/get/query-param?user=yuni&email=test@email.com$age=3
    @GetMapping("query-param")
    public String queryParam(@RequestParam Map<String, String> queryParam) {
        StringBuffer sb = new StringBuffer();

        //위와 같이 받을 경우 뭐가 들어올지 알 수 없어 key값을 지정해줘야 한다.
        queryParam.get("name");

        queryParam.entrySet().forEach(e -> {
            System.out.println("queryParam key = " + e.getKey());
            System.out.println("queryParam value = " + e.getValue());
            System.out.println("\n");

            sb.append(e.getKey()+"/"+e.getValue());
        });

        return sb.toString();
    }

    //key값을 지정하지 않기 위해서
    @GetMapping("query-param02")
    public String queryParam02(@RequestParam String name,
                               @RequestParam String email,
                               @RequestParam int age){
        /*
        http://localhost:8080/api/get/query-param02?name=1&email=2&age=3

        name = 1
        email = 2
        age = 3 */

        System.out.println("name = "+name);
        System.out.println("email = "+email);
        System.out.println("age = "+age);

        return name+" "+email+" "+age;
    }

    @GetMapping("query-param03")
    //@RequestParam 객체일 경우 사용하지 않는다.
    public String queryParam03(UserRequest userRequest){

        System.out.println("name = "+ userRequest.getName());
        System.out.println("email = "+ userRequest.getEmail());
        System.out.println("age = "+ userRequest.getAge());

        //return userRequest.getName()+" "+userRequest.getEmail()+" "+userRequest.getAge();
        return userRequest.toString();
    }

}
