package com.service.backend.bookshop.security.service;

import com.service.backend.bookshop.common.entity.security.User;
import com.service.backend.bookshop.security.dto.JwtAuthenticationResponse;
import com.service.backend.bookshop.security.dto.RefreshTokenRequest;
import com.service.backend.bookshop.security.dto.SigningRequest;
import com.service.backend.bookshop.security.dto.SignupRequest;

public interface AuthenticationService {
    User signup(SignupRequest signupRequest);
    JwtAuthenticationResponse signing(SigningRequest signingRequest);
    public JwtAuthenticationResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}
