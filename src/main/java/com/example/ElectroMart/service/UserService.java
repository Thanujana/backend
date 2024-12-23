package com.example.ElectroMart.service;

import com.amazonaws.Response;
import com.example.ElectroMart.dto.UserDto;

public interface UserService {
   Response registerUser(UserDto registrationRequest); 
   Response loginUSer(LoginRequest loginRequest);

   Response getAllUsers();
   User getLoginUser();
   Response getUserInfoAndOrderHistory();
}
