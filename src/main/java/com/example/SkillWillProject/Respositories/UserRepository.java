package com.example.SkillWillProject.Respositories;

import com.example.SkillWillProject.model.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserRepository {
    private List<User> users = new ArrayList<>();

    public UserRepository() {
        users.add(new User(1L, "Alice"));
        users.add(new User(2L, "Bob"));
    }

    public List<User> findAll() {
        return users;
    }

    public User findById(Long id) {
        return users.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public void save(User user) {
        users.add(user);
    }
}
