package com.hastycode.SpringSecExample.controller;

import com.hastycode.SpringSecExample.model.Users;
import com.hastycode.SpringSecExample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class UserController {
        @Autowired
        private UserService service;

        @PostMapping("/register")
        public Users register(@RequestBody Users user) {
            return service.register(user);
        }
}
