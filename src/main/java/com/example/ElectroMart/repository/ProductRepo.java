package com.example.ElectroMart.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.ElectroMart.model.Order;
import com.example.ElectroMart.model.Product;

public interface ProductRepo extends MongoRepository<Order,Long> {
    List<Product> findByCategoryId(Long categoryId);
    List<Product> findByNameOrDescriptionContaining(String name,String description);

}
