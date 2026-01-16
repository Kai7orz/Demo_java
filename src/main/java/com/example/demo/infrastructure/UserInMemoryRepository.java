package com.example.demo.infrastructure;

import com.example.demo.model.User;
import com.example.demo.usecase.user.interfaces.UserRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserInMemoryRepository implements UserRepository{
    private final Map<Integer,User> store = new HashMap<>();
    private Integer userCount = 0;

    @Override
    public User save(User user) {
        this.userCount++;
        this.store.put(this.userCount,user);
        return user;
    }

    public User find(Integer userId) {
        if(this.store.get(userId) != null){
            return this.store.get(userId);
        }
        else {
            return null;
        }
    }
}
