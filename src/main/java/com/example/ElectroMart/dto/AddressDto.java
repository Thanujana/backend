package com.example.ElectroMart.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@AllArgsConstructor
@NoArgsConstructor



public class AddressDto {
    private String id;
    private String street;
    private String city;
    private String state;
    private String zipCode;
    private String country;

    private UserDto user; // Reference to a User DTO for the relationship

    private LocalDateTime createdAt;
    

}
