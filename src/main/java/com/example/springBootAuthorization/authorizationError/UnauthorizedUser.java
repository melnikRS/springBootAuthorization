package com.example.springBootAuthorization.authorizationError;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class UnauthorizedUser extends RuntimeException {
    public UnauthorizedUser(String msg) {
        super(msg);
        throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, msg);
    }
}