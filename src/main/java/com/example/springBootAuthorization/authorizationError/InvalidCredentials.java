package com.example.springBootAuthorization.authorizationError;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.server.ResponseStatusException;

public class InvalidCredentials extends RuntimeException {
    public InvalidCredentials(String msg) {
        super(msg);
        throw new ResponseStatusException(HttpStatus.BAD_REQUEST, msg);
    }
}
