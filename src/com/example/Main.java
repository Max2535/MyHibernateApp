package com.example;

import com.example.dao.UserDAO;
import com.example.entity.User;

public class Main {

    public static void main(String[] args) {
        UserDAO userDAO = new UserDAO();

        // Create
        User user = new User("max", "max.doe@example.com");
        userDAO.saveUser(user);

        // Read
        User retrievedUser = userDAO.getUserByUser("john_doe");
        System.out.println("Retrieved User: " + retrievedUser);

        // Update
        retrievedUser.setEmail("updated.email@example.com");
        userDAO.updateUser(retrievedUser);

//        // Delete
//        userDAO.deleteUser(1);
//
//        // List all users
//        List<User> users = userDAO.getAllUsers();
//        users.forEach(System.out::println);
    }
}
