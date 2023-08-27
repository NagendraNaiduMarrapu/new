package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String showLoginForm(Model model) {
        model.addAttribute("user", new User()); // Add an empty User object to the model
        return "login"; // Display the login form
    }

    @PostMapping("/login")
    public String loginUser(@ModelAttribute User user, Model model) {
        // Authenticate the user by checking their credentials against the database.
        // You can use the UserService to perform this authentication.
        
        if (userService.createUser(user)) {
            // User authentication successful. You can redirect to a welcome page.
            return "welcome";
        } else {
            // User authentication failed. Display an error message.
            model.addAttribute("error", "Invalid username or password.");
            return "login"; // Display the login form with an error message
        }
    }
}
