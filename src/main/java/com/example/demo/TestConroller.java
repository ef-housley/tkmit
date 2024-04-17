package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestConroller {

    // suna endpoint diyilyar
    @GetMapping("/hello")
    public String greetPeople(){
        return "hello, gyzlar!";
    }

}
