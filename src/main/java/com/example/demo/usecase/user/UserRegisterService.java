package com.example.demo.usecase.user;

import com.example.demo.model.User;
import com.example.demo.usecase.user.interfaces.UserRepository;

public class UserRegisterService {
    UserRepository repo;

    public UserRegisterService (UserRepository repo) {
        // repo に引数に渡したユーザーを登録する処理（repo interface method を呼び出す）
        this.repo = repo;
    }

    public User save(User user) {
        return this.repo.save(user);
    }
}
