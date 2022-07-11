package com.bookstore.store.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/users")
public class UserController {
    private final UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    @CrossOrigin
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @GetMapping("/user")
    @CrossOrigin
    public Optional<User> getCurrentUser(Principal principal) {
        return userService.getUserByUsername(principal.getName());
    }

//    @GetMapping(path = "{id}")
//    public Optional<User> getUserById(@PathVariable("id") int userId) {
//        return userService.getUser(userId);
//    }

    @PostMapping
    @CrossOrigin
    public void newUser(@RequestBody User user) {
        userService.addNewUser(user);
    }

    @DeleteMapping(path = "{userId}")
    public void delUser(@PathVariable("userId") int userId) {
        userService.deleteUser(userId);
    }

    @PutMapping(path = "{userId}")
    public void updateUserById(
            @PathVariable("userId") int id,
            @RequestParam(required = false) String fullName,
            @RequestParam(required = false) String email,
            @RequestParam(required = false) String password,
            @RequestParam(required = false) String gender
    ) {
        userService.updateUser(id, fullName, email,password,gender);
    }
}
