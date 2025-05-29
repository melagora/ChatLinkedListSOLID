package com.kodigo.jd20.chat.service;

import com.kodigo.jd20.chat.model.User;

import java.util.HashMap;
import java.util.Map;

//7
public class UserService {
    private final Map<String, User> users = new HashMap<>();

    public User createUSer(String id, String name){
        User user = new User(id,name);
        users.put(id, user);
        return user;
    }

    public User getUser (String id){
        return users.get(id);
    }
}
