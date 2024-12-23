package com.example.ElectroMart.dto;

import java.util.List;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@AllArgsConstructor
@NoArgsConstructor

public class CategoryDto {

    private String id; // MongoDB uses String for IDs (ObjectId)

    private String name;

    private List<ProductDto> productList;

}
