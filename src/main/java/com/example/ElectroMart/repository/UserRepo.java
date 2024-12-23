package com.example.ElectroMart.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.ElectroMart.model.User;

public interface UserRepo extends MongoRepository<User,Long> {
    Optional <User> findByEmail(String email);
    

}
