package com.aditya.implementJWT.springBootJWTAuthentication.service;

import com.aditya.implementJWT.springBootJWTAuthentication.dto.req.UserRequestDto;
import com.aditya.implementJWT.springBootJWTAuthentication.dto.resp.UserResponseDto;

import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

/**
 * Created by Abhinash Singh - 2024
 */

public interface UserService extends UserDetailsService {
    List<UserResponseDto> getAllUser();
    public UserResponseDto createUser(UserRequestDto userRequestDto);

}
