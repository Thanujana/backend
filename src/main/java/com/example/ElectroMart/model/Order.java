package com.example.ElectroMart.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;

@Data
@Document(collection ="orders")
public class Order {
    @Id
    private String id;
    private BigDecimal totalPrice;

    @DBRef // Reference to OrderItem documents
    private List<OrderItem> orderItemList;

    @Field("created_at") // Map field name to MongoDB
    private final LocalDateTime createdAt = LocalDateTime.now();



}
