package com.mycompany.registrationlogi;

public class Registration {
    
    public boolean checkUserName(String username) {
        return username.contains("_") && username.length() <= 5;
    }
    
    public boolean checkPasswordComplexity(String password) {
        return password.length() >= 8 &&
               password.matches(".*[A-Z].*") &&
               password.matches(".*\\d.*") &&
               password.matches(".*[!@#$%^&*()-_=+\\\\|\\[{\\]};:'\",<.>/?].*");
    }
    
    public String registerUser(String username, String password, String firstName, String lastName) {
        if (!checkUserName(username)) {
            return "Username is not correctly formatted. Please ensure that your username contains an underscore and is no more than 5 characters in length.";
        }
        if (!checkPasswordComplexity(password)) {
            return "Password is not correctly formatted. Please ensure that the password contains at least 8 characters, a capital letter, a number, and a special character.";
        }
        // Register the user (Placeholder)
        return "User registered successfully.";
    }
}
