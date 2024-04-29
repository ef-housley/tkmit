package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestConroller {
    @GetMapping("/Aygul")
    public  int greetPeople(){
        return 1234;
    }


    //Leyla

}


