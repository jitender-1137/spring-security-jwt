package com.springsecurityjwt.model;

import lombok.Data;

@Data
public class AuthenticationResponse {

    private final String jwt;
}
