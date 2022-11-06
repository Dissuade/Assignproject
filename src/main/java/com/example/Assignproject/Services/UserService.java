package com.example.Assignproject.Services;

import com.example.Assignproject.model.User;
import com.example.Assignproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public User getUser()
    {

        return userRepository.getUser();
    }

}
