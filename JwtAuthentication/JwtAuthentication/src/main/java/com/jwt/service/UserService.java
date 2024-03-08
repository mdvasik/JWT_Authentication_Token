package com.jwt.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.jwt.entity.User;

@Service
public class UserService {


    private List<User> store = new ArrayList<>();

    public UserService() {
        store.add(new User(UUID.randomUUID().toString(), "Vasik", "vasik@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Zaid", "zaid@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Rafiq", "rafiq@gmail.com"));
    }

    public List<User> getAllUsers() {
        return store;
    }

}
