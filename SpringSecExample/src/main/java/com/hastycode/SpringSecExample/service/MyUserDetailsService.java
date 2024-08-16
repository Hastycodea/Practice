package com.hastycode.SpringSecExample.service;

import com.hastycode.SpringSecExample.model.UserPrincipal;
import com.hastycode.SpringSecExample.repo.UserRepo;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    private UserRepo repo;

    public MyUserDetailsService(UserRepo repo) {
        this.repo = repo;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = repo.findByUsername(username);

        if(user == null) {
            System.out.println("User not found!");
            throw new UsernameNotFoundException("User not found!");
        }

        return new UserPrincipal(user);
    }
}
