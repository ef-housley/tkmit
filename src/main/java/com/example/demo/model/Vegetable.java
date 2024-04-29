package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Vegetable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int vegatableId;

    private String vegatableName;

    public Vegetable() {}
    public void Vegatable(int id, String name){
        this.vegatableId=id;
        this.vegatableName=name;


    }

    public int getvegatableId(){
        return vegatableId;
    }
}