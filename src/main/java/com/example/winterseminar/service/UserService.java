package com.example.winterseminar.service;


import com.example.winterseminar.domain.User;
import com.example.winterseminar.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Transactional
    public User registerUser(String username, String password) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        return userRepository.save(user);
    }

    public User authenticate(String username, String password) {
        User user = userRepository.findByusername(username);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }






}
