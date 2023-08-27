package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    @Autowired
    private UserDAO userDAO;

    public boolean createUser(User user) {
        // You can perform additional validation here before calling the DAO
        // For example, checking if the username or email is already taken
        return userDAO.createUser(user);
    }

    public User getUserByUsername(String username) {
        // You can implement additional logic here, such as handling exceptions or logging
        return userDAO.getUserByUsername(username);
    }
}

