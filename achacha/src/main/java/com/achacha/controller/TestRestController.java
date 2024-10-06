package com.achacha.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestRestController {

    @GetMapping("/hello") 
    public String helloWorld() {
        return "hello world! I'm from Boot!";
    }
    
    @PostMapping("/from-vue") //JSON 데이터 받기
    void receiveMessage(@RequestBody String message) {
        System.out.println(">>>> 뷰에서 받은 메세지: " + message);
    }
	
}
