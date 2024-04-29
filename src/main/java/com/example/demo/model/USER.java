package com.example.demo.model;

public class USER {
    public class User {
        // Attributes
        private String username;
        private String email;
        private String password;
        private int age;

        // Constructor
        public User(String username, String email, String password, int age) {
            this.username = username;
            this.email = email;
            this.password = password;
            this.age = age;
        }

        // Getters and Setters
        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        // Other getters and setters for password, age, etc.

        // Additional methods
        public void displayUserInfo() {
            System.out.println("Username: " + username);
            System.out.println("Email: " + email);
            System.out.println("Age: " + age);
            // Add other attributes as needed
        }

        // You can add more methods here as per your requirements
    }

    public class Main {
        public static void main(String[] args) {
// Create a new userUser user1 = new User("leyla_nyzamova", "leylanyzamova@gmail.com", "password123"; age
            // Display user information
            user1.displayUserInfo();
            // Update email
            user1.setEmail("leylanyzamova@gmail.com");

            // Display updated information
            user1.displayUserInfo();
        }
    }
}





