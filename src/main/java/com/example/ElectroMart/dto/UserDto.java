package com.example.ElectroMart.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class UserDto {
    private String id; // MongoDB uses String for IDs (ObjectId)

    private String email;

    private String name;

    private String phoneNumber;

    private String password;

    private String role; // e.g., "USER", "ADMIN", "SELLER"

    private List<OrderItemDto> orderItemList; // List of associated order items

    private AddressDto address; 


}
