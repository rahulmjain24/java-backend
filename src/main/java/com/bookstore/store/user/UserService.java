package com.bookstore.store.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserByEmail(String email) {return userRepository.findByEmail(email);}

    public Optional<User> getUserByUsername(String username) {return userRepository.findByUsername(username);}

    public Optional<User> getUser(int id) {
        return userRepository.findById(id);
    }

    public void addNewUser(User user) {
        System.out.println(user);
        userRepository.save(user);
    }

    public void deleteUser(int userId) {
        boolean exists = userRepository.existsById(userId);
        if(!exists) {
            throw new IllegalStateException("User doesn't exist");
        } else {
            userRepository.deleteById(userId);
        }
    }

    @Transactional
    public void updateUser(int id, String fullName, String email, String password, String gender) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException("User with id "+id+" doesn't exist.")
                );

        if(fullName != null && fullName.length() > 0 && !Objects.equals(user.getFullName(),fullName))
            user.setFullName(fullName);

        if(email != null && email.length() > 0 && !Objects.equals(user.getEmail(),email))
            user.setEmail(email);

        if(password != null && password.length() > 0 && !Objects.equals(user.getPassword(),password))
            user.setPassword(password);

        if(gender != null && gender.length() > 0 && !Objects.equals(user.getGender(),gender))
            user.setGender(gender);
    }
}
