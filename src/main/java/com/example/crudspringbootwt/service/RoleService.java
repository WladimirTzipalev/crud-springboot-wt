package com.example.crudspringbootwt.service;

import com.example.crudspringbootwt.model.Role;
import java.util.List;

public interface RoleService {
    List<Role> getAllRoles();

    Role findById(Long id);

    void saveRole(Role role);
}
