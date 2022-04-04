package com.example.demo_web.model;

import com.example.demo_web.entity.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyRepositoryTest {

    @Test
    void save() {
        MyRepository<Product> myRepository = new MyRepository<>();
        myRepository.save(new Product("Name012", "abc.jpg",2000.0));
    }
}