package com.test.testapi.service;

import com.test.testapi.model.User;
import com.test.testapi.repo.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

import java.util.List;

@RequiredArgsConstructor
public class MyUserDetailsService implements UserDetailsService
{
    UserRepo repository;
    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException
    {
        User user = repository.findByUsername(username);
        
    }
}
