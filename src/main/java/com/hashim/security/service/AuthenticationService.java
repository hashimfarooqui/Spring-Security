package com.hashim.security.service;

import com.hashim.security.dao.request.SignUpRequest;
import com.hashim.security.dao.request.SigninRequest;
import com.hashim.security.dao.response.JwtAuthenticationResponse;

public interface AuthenticationService {
    JwtAuthenticationResponse signup(SignUpRequest request);

    JwtAuthenticationResponse signin(SigninRequest request);
}
