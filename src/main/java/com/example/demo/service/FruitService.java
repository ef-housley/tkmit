package com.example.demo.service;


import com.example.demo.model.Fruit;
import com.example.demo.repository.FruitRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FruitService {

    @Autowired
    FruitRepo fruitRepo;

    public boolean save(int id, String fruitName){
        Fruit tazeFrukty = new Fruit(id, fruitName);
        if (fruitRepo.save(tazeFrukty)!=null){
            return true;
        }
        return false;
    }

}
