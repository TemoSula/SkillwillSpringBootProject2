package com.example.SkillWillProject.Services;

import com.example.SkillWillProject.Respositories.UserRepository;
import com.example.SkillWillProject.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
    public class UserService {

        private final UserRepository userRepository;

        @Autowired
        public UserService(UserRepository userRepository) {
            this.userRepository = userRepository;
        }

        public List<User> getAllUsers() {
            return userRepository.findAll();
        }

        public User getUserById(Long id) {
            return userRepository.findById(id);
        }

        public void addUser(User user) {
            userRepository.save(user);
        }
    }


