package com.sgwannabig.smallgift.springboot.dto;

import com.sgwannabig.smallgift.springboot.domain.Provider;
import com.sgwannabig.smallgift.springboot.domain.Role;
import lombok.Data;

import java.util.List;

@Data
public class SignupDto {
    private String username;
    private String password;
    private String email;
    private Provider provider;
    private Role Role;
}