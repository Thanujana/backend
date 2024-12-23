package com.example.ElectroMart.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;

@Data
@Document(collection ="addresses")

public class Address {
@Id
private String id;

private String street;
private String city;
private String state;
private String zipCode;
private String country;

@DBRef // Reference to the User document
    private User user;

    @Field("created_at") // Map field name to MongoDB
    private final LocalDateTime createdAt = LocalDateTime.now();


}
