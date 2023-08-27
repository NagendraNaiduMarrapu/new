package com.spring;


import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class UserDAO {
	
    // Method to insert a new user into the database
    public boolean createUser(User user) {
    	try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        String sql = "INSERT INTO users (username, password, email) VALUES (?, ?, ?)";
        try (
            Connection connection = DriverManager
		            .getConnection("jdbc:postgresql://localhost:5432/postgres",
		            "postgres", "1234");
            PreparedStatement preparedStatement = connection.prepareStatement(sql)
        ) {
            preparedStatement.setString(1, user.getUsername());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.setString(3, user.getEmail());
            int affectedRows = preparedStatement.executeUpdate();
            return affectedRows > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public User getUserByUsername(String username) {
    	try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        String sql = "SELECT * FROM users WHERE username = ?";
        try (
        		Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres", "1234");
            PreparedStatement preparedStatement = connection.prepareStatement(sql)
        ) {
            preparedStatement.setString(1, username);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    User user = new User();
                    user.setId(resultSet.getInt("id"));
                    user.setUsername(resultSet.getString("username"));
                    user.setPassword(resultSet.getString("password"));
                    user.setEmail(resultSet.getString("email"));
                    return user;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null; // User not found
    }
}
