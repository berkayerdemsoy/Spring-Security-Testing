package com.berkai.spring_security.Service;

import com.berkai.spring_security.Entity.User;
import com.berkai.spring_security.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);
    public User register( User user){
        user.setPassword(encoder.encode(user.getPassword()));
        return userRepo.save(user);
    }
}
