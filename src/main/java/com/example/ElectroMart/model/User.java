package com.example.ElectroMart.model;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails.Address;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.example.ElectroMart.enums.UserRole;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Document(collection ="users")
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class
User {
    @Id
    
    private String id;
    
    @NotBlank(message = "Name is required")
    private String name;
    @Field
    @NotBlank(message = "Email is required")
    private String email;

    @NotBlank(message = "Password is required")
    private String password;

    @Field("phone_number")
    @NotBlank(message = "Phone number is required")
    private String phoneNumber;

   private UserRole role;
   @DBRef 
   private List<OrderItem> orderItemList;

   @DBRef
   private Address address;

   @Field ("created_at")
    private final LocalDateTime createdAt = LocalDateTime.now();

}
