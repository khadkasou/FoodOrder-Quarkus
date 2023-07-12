package org.souraj.service;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import org.souraj.dto.UserDto;
import org.souraj.exceptions.CustomExceptions;
import org.souraj.model.User;
import org.souraj.repository.UserRepository;

import java.util.List;

@RequestScoped
public class UserServiceImpl implements UserService{
    @Inject
    UserRepository userRepository;

    @Override
    public User save(UserDto userDto) {
//        User user = new User();
//        user.setFirstName(userDto.getFirstName());
//        user.setLastName(userDto.getLastName());
//        if (this.isUsernameExists(userDto.getUsername())){
//            throw new CustomExceptions("User with username "+
//                    userDto.getUsername()+" Already Exits.Try a new one");
//        }
//        user.setUsername(userDto.getUsername());
//        if (this.isEmailExists(userDto.getEmail())){
//            throw new CustomExceptions("User with username "+
//                    userDto.getEmail()+" Already Exits.Try a new one");
//        }
//        user.setEmail(userDto.getEmail());



        return null;

    }

    @Override
    public User findUserByUsername(String username) {
        return null;
    }

    @Override
    public User findUserByEmail(String email) {
        return null;
    }

    @Override
    public List<User> findAllUser() {
        return null;
    }

    @Override
    public void deleteUser(String username) {

    }

    @Override
    public User updateUser(UserDto userDto) {
        return null;
    }

    @Override
    public Boolean isUsernameExists(String username) {
        return null;
    }

    @Override
    public Boolean isEmailExists(String email) {
        return null;
    }

    @Override
    public User findUserByUsernameAndPassword(String username, String password) {
        return null;
    }
}
