package com.example.springBootAuthorization.repository;

import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {

        if (user.equals("admin") && password.equals("1234")) {
            return List.of(Authorities.values());
        } else if (user.equals("user") && password.equals("4321")) {
            return List.of(Authorities.READ);
        }

        return null;
    }
}
