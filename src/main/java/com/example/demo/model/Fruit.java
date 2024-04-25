package com.example.demo.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Fruit {
    //attributes(properties) = ady, familyasy, 2 sany eli, 2 sany ayagy bar, .....
    //methods(edip bilyan zatlary) = nahar bisirip bilya, ceynap bilmek, gurlap bilya, ....
    //constructor-> gurup bilmek ucin gerek
    //getter setters
    // singleton design.
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int fruitId; //camelCase
    private String fruitName;



    public Fruit() {}
    public Fruit(int id, String name){
        this.fruitId=id;
        this.fruitName=name;
    }



    public int getFruitId(){
        return fruitId;
    }

    public String getFruitName(){
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    // oy isi Leyla bn Aygule -> aygul-Vegetable class doret
    //leyla -> user
}
