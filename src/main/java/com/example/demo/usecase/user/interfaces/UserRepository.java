package com.example.demo.usecase.user.interfaces;

import com.example.demo.model.User;
import com.example.demo.model.UserId;

public interface UserRepository {
    public abstract User save(User user);
    public abstract User find(Integer userId);
 }
