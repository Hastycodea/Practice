package com.hastycode.SpringSecExample.repo;

import com.hastycode.SpringSecExample.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Users, Integer> {

    User findByUsername(String username);
}
