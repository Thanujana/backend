package com.example.ElectroMart.service.serviceimpl;

import java.util.List;

import com.amazonaws.Response;
import com.example.ElectroMart.dto.UserDto;
import com.example.ElectroMart.enums.UserRole;
import com.example.ElectroMart.repository.UserRepo;

public class UserServiceImpl {
    private final UserRepo userRepo;

     @Override
    public Response registerUser(UserDto registrationRequest) {
        UserRole role = UserRole.USER;

        if (registrationRequest.getRole() != null && registrationRequest.getRole().equalsIgnoreCase("admin")) {
            role = UserRole.ADMIN;
        }

        User user = User.builder()
                .name(registrationRequest.getName())
                .email(registrationRequest.getEmail())
                .password(passwordEncoder.encode(registrationRequest.getPassword()))
                .phoneNumber(registrationRequest.getPhoneNumber())
                .role(role)
                .build();

                User savedUser = userRepo.save(user); // Save to MongoDB
                System.out.println(savedUser};


        UserDto userDto = entityDtoMapper.mapUserToDtoBasic(savedUser);
        return Response.builder()
                .status(200)
                .message("User Successfully Added")
                .user(userDto)
                .build();

}

@Override
public Response getAllUsers() {
    List<User> users = userRepo.findAll(); // MongoDB findAll
    List<UserDto> userDtos = users.stream()
            .map(entityDtoMapper::mapUserToDtoBasic)
            .toList();

    return Response.builder()
            .status(200)
            .userList(userDtos)
            .build();
}
   @Override
    public User getLoginUser() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String email = authentication.getName();
        log.info("User Email is: " + email);
        return userRepo.findByEmail(email) // MongoDB findByEmail
                .orElseThrow(() -> new UsernameNotFoundException("User Not found"));

                @Override
                public Response getUserInfoAndOrderHistory() {
                    User user = getLoginUser();
                    UserDto userDto = entityDtoMapper.mapUserToDtoPlusAddressAndOrderHistory(user);
            
                    return Response.builder()
                            .status(200)
                            .user(userDto)
                            .build();
                }
            }
    }





