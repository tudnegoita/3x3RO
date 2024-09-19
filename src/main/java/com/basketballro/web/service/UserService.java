package com.basketballro.web.service;

import com.basketballro.web.dtos.RegistrationDto;
import com.basketballro.web.models.UserEntity;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    void saveUser(RegistrationDto registrationDto);

    UserEntity findByEmail(String email);

    UserEntity findByUsername(String username);
}
