package com.berkai.spring_security.Controller;

import com.berkai.spring_security.Entity.User;
import com.berkai.spring_security.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/register")
    public User register(@RequestBody User user){
        return userService.register(user);
    }
}
