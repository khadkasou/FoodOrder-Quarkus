package org.souraj.service;

import org.souraj.dto.UserDto;
import org.souraj.model.User;

import java.util.List;

public interface UserService {

    User save(UserDto user);
    User findUserByUsername(String username);
    User findUserByEmail(String email);
    List<User> findAllUser();
    void deleteUser(String username);
    User updateUser(UserDto userDto);
    Boolean isUsernameExists(String username);
    Boolean isEmailExists(String email);
    User findUserByUsernameAndPassword(String username, String password);






}
