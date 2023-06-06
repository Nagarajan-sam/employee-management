package com.Kanimozhi.springboot.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.Kanimozhi.springboot.dto.UserRegistrationDto;
import com.Kanimozhi.springboot.model.User;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
