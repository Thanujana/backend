package com.example.ElectroMart.service;

import com.amazonaws.Response;
import com.example.ElectroMart.dto.UserDto;

public interface UserService {
   void registerUsser(UserDto registrationRequest); 
   Response loginUSer(LoginRequest loginRequest);

   Response getAllUsers();
   void LoginUser();
   Response getUserInfoAndOrderHistory();
}
