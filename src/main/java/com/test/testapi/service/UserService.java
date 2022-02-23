package com.test.testapi.service;

import java.util.List;
import java.util.Optional;

import com.test.testapi.model.User;

public interface UserService 
{
    List<User> getUsers();
    User addUser(User user);
    Optional<User> getUserById(Long id);
    void deleteUser(Long id);
    User updateUser(User user);
}
