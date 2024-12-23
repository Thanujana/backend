package com.example.ElectroMart.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;

@Data
@Document(collection = "reviews")
public class Review {
   @Id
    private String id; // MongoDB uses String for IDs, typically ObjectId

    private String content;

    private int rating; // Assuming it is in the range of 1 to 10

    @DBRef // Reference to the Product document
    private Product product;

    @DBRef // Reference to the User document
    private User user;

    @Field("created_at") // Map field name to MongoDB
    private final LocalDateTime createdAt = LocalDateTime.now();

}
