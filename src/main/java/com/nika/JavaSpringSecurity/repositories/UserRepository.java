package com.nika.JavaSpringSecurity.repositories;

import com.nika.JavaSpringSecurity.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository extends JpaRepository<User, Long> {
    UserDetails findByLogin(String role);
}
