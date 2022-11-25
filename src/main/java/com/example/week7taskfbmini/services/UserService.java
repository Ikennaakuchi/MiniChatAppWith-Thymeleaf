package com.example.week7taskfbmini.services;

import com.example.week7taskfbmini.entities.User;

public interface UserService {
    User createUser(User user);

    User findUserByUsernameAndPassword(User user);

    User findById(Long id);
}
