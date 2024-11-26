package com.mezen.users.service;

import java.util.List;
import java.util.Optional;

import com.mezen.users.entities.Role;
import com.mezen.users.entities.User;
import com.mezen.users.service.registre.RegistrationRequest;

public interface UserService {
User saveUser(User user);
User findUserByUsername (String username);
Role addRole(Role role);
User addRoleToUser(String username, String rolename);
List<User> findAllUsers();
User registreUser(RegistrationRequest request);
public void sendEmailUser(User u, String code);
public User validateToken(String code);
}
