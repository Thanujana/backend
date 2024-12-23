package com.example.ElectroMart.model;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;

@Data
@Document(collection="categories")

public class Category {

     @Id
    private String id; 

     @Field("name")
    private String name;

    @DBRef // Reference to Product documents
    private List<Product> productList;

    @Field("created_at") // Map field name to MongoDB
    private final LocalDateTime createdAt = LocalDateTime.now();

}
