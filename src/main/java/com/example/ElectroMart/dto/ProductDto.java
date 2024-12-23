package com.example.ElectroMart.dto;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ProductDto {
    private String id; // MongoDB uses String for IDs (ObjectId)

    private String name;

    private String description;

    private BigDecimal price;

    private String imageUrl;

    private CategoryDto category; // Associated category



}
