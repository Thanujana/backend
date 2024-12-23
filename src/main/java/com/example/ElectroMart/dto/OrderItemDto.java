package com.example.ElectroMart.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderItemDto {
    private String id; // MongoDB uses String for IDs (ObjectId)

    private int quantity;

    private BigDecimal price;

    private String status; // Representing the order status (e.g., "PENDING", "COMPLETED")

    private UserDto user; // User associated with this order item

    private ProductDto product; // Product associated with this order item

    private LocalDateTime createdAt; 


}
