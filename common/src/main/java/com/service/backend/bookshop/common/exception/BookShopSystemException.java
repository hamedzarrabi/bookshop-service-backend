package com.service.backend.bookshop.common.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

public class BookShopSystemException extends RuntimeException{

    @Getter
    private final HttpStatus status;
    private final String message;

    public BookShopSystemException(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }

    public BookShopSystemException(String message, HttpStatus status, String message1) {
        super(message);
        this.status = status;
        this.message = message1;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
