package com.example.demo.model;

import com.example.demo.infrastructure.UserInMemoryRepository;
import com.example.demo.usecase.user.UserRegisterService;
import com.example.demo.usecase.user.interfaces.UserRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {
    // private final PasswordEncoder encoder = null;
    private UserRepository repo = new UserInMemoryRepository();
    private UserRegisterService ur = new UserRegisterService(repo);

    // 正常系
    @Test
    public void SaveTest() {
        User user = new User("test_user","test@example.com");
        User created = ur.save(user);
        assertNotNull(created);
        // 特定のuser が登録できたかチェックするメソッド assert (get or find)
        assertEquals("test_user",repo.find(Integer.valueOf(1)).getName());
    }
}
