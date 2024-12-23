package com.example.ElectroMart.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;

@Data
@Document(collection ="products")
public class Product {
    @Id
    private String id;

    private String name;
    private String description;
    private String imageUrl;
    private BigDecimal price;

    @DBRef // Reference to the Category document
    private Category category;

    @Field("created_at") // Map field name to MongoDB
    private final LocalDateTime createdAt = LocalDateTime.now();



}
