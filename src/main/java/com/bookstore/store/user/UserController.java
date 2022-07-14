package com.bookstore.store.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping(path = "api/users")
public class UserController {
    private final UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @GetMapping("/user")
    public Optional<User> getCurrentUser(Principal user) {
        if(user == null ) {
            throw new Error("You are not logged in");
        }
        return userService.getUserByUsername(user.getName());
    }

    @GetMapping(path = "{id}")
    public Optional<User> getUserById(@PathVariable("id") int userId) {
        return userService.getUser(userId);
    }

    @PostMapping
    public void newUser(@RequestBody User user) {
        userService.addNewUser(user);
    }

    @DeleteMapping(path = "{userId}")
    public void delUser(@PathVariable("userId") int userId) {
        userService.deleteUser(userId);
    }

//    @PutMapping(path = "{userId}")
//    public void updateUserById(
//            @PathVariable("userId") int id,
//            @RequestParam(required = false) String fullName,
//            @RequestParam(required = false) String email,
//            @RequestParam(required = false) String password,
//            @RequestParam(required = false) String gender
//    ) {
//        userService.updateUser(id, fullName, email,password,gender);
//    }

    @PutMapping
    public User addBookToUser(@RequestParam int bookId,Principal principal) {
        return userService.addBooktoUser(principal.getName(), bookId);
    }

    @DeleteMapping
    public User removeBook(@RequestParam int bookId,Principal principal) {
        return userService.removeBookFromUser(principal.getName(), bookId);
    }
}
