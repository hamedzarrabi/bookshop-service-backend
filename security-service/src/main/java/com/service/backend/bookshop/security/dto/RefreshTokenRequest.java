package com.service.backend.bookshop.security.dto;

import lombok.Data;

@Data
public class RefreshTokenRequest {
    private String token;
}
