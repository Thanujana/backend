package com.example.ElectroMart.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;

@Data
@Document(collection = "payments")
public class Payment {
    @Id
    private String id; // MongoDB uses String for IDs, typically ObjectId

    private BigDecimal amount;
    private String method;
    private String status;

    @DBRef // Reference to the Order document
    private Order order;

    @Field("created_at") // Map field name to MongoDB
    private final LocalDateTime createdAt = LocalDateTime.now();
}


