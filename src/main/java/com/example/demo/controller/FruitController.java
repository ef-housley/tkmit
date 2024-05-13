package com.example.demo.controller;

import com.example.demo.service.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/fruit")
public class FruitController {
    @Autowired
    FruitService fruitService;


    @PostMapping("/save")
    public boolean saveFruit(@RequestParam("id") int fruitId, @RequestParam("name") String fruitName){
        return fruitService.save(fruitId, fruitName);
    }






}
