package com.example.ElectroMart.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto {
    private String id; // MongoDB uses String for IDs (ObjectId)

    private BigDecimal totalPrice;

    private LocalDateTime createdAt;

    private List<OrderItemDto> orderItemList;

}
