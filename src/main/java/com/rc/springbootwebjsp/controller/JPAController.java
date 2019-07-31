package com.rc.springbootwebjsp.controller;

import com.rc.springbootwebjsp.entity.User;
import com.rc.springbootwebjsp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author liux
 * @Date 19-7-24 上午12:43
 * @Version 1.0
 */
@RestController
public class JPAController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable Integer id) {
        return userRepository.findById(id).orElse(new User());
    }
}
