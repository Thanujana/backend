package com.example.ElectroMart.repository;

import java.util.Locale.Category;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CategoryRepo  extends MongoRepository<Category,Long>{

}
