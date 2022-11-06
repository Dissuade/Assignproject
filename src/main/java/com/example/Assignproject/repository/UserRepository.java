package com.example.Assignproject.repository;

import com.example.Assignproject.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    public User getUser()
    {

        User user=new User ("Gurpreet", "Surrey", 21);
        return user;
    }

}
