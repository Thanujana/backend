package com.example.ElectroMart.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.ElectroMart.model.Address;

public interface AddressRepo extends MongoRepository<Address,String>{

}
