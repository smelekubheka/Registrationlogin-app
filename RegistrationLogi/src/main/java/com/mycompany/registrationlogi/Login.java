package com.mycompany.registrationlogi;

public class Login {
    
    // Dummy data for demonstration purposes
    private static final String storedUsername = "test_user";
    private static final String storedPassword = "Test@123";
    
    public boolean loginUser(String username, String password) {
        return username.equals(storedUsername) && password.equals(storedPassword);
    }
}
