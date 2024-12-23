package com.example.ElectroMart.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.ElectroMart.model.Order;

public interface OrderRepo extends MongoRepository<Order,Long> {

}
