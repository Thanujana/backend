package com.example.ElectroMart.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.example.ElectroMart.enums.OrderStatus;

import lombok.Data;

@Data
@Document(collection ="order_items")
public class OrderItem {
    @Id
    private String id; // MongoDB uses String for IDs, typically ObjectId

    private int quantity;
    private BigDecimal price;
    private OrderStatus status;

    @DBRef // Reference to the User document
    private User user;

    @DBRef // Reference to the Product document
    private Product product;

    @DBRef // Reference to the Order document
    private Order order;

    @Field("created_at") // Map field name to MongoDB
    private final LocalDateTime createdAt = LocalDateTime.now();


}
