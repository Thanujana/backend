package com.example.ElectroMart.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.ElectroMart.model.OrderItem;

public interface OrderItemRepo extends MongoRepository<OrderItem,Long>{

}
