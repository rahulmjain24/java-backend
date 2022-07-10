package com.bookstore.store.user;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    private int userId;

    @Column(name = "username")
    private String username;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "gender")
    private String gender;

//    @Column(name = "enabled")
//    private boolean enabled;

//    @Column(name = "created_at")
//    private Timestamp createdAt;

    public void setUsername(String username) {
        this.username = username;
    }

//    public void setEnabled(boolean enabled) {
//        this.enabled = enabled;
//    }

    public String getUsername() {
        return username;
    }

//    public boolean isEnabled() {
//        return enabled;
//    }

    public User() {
    }

    public User(String username, String fullName, String email, String password, String gender) {
        LocalDateTime now = LocalDateTime.now();
        this.username = username;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.gender = gender;
    }

    public int getUserId() {
        return userId;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getGender() {
        return gender;
    }

//    public Timestamp getCreatedAt() {
//        return createdAt;
//    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

//    public void setCreatedAt(Timestamp createdAt) {
//        this.createdAt = createdAt;
//    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", gender='" + gender + '\'' +
//                ", enabled=" + enabled +
//                ", createdAt=" + createdAt +
                '}';
    }
}
