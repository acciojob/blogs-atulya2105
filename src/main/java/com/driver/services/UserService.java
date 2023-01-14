package com.driver.services;

import com.driver.RequestDto.UserDto;
import com.driver.models.*;
import com.driver.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository3;

    @Autowired
    BlogService blogService3;

    public void createUser(UserDto userDto){
        User user = new User();
        user.setUserName(userDto.getUserName());
        user.setEmail(userDto.getEmail());
        user.setMobileNo(userDto.getMobileNo());
        userRepository3.save(user);


    }

    public void deleteUser(int userId){
//
       userRepository3.deleteById(userId);

    }

    public void updateUser(User user){
        userRepository3.save(user);
    }

    public User findUserByUsername(String username){
        return userRepository3.findByUserName(username);
    }
}
