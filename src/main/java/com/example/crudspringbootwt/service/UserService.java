package com.example.crudspringbootwt.service;

import com.example.crudspringbootwt.model.User;
import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User getById(Long id);

    User getByLogin(String email);

    void update(User updateUser);

    void save(User user);

    void delete(Long id);
}
