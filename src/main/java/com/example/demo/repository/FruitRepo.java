package com.example.demo.repository;

import com.example.demo.model.Fruit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FruitRepo extends JpaRepository<Fruit, Integer> {
    //create, delete, update, read, save

    Fruit save(Fruit fruit);
}
