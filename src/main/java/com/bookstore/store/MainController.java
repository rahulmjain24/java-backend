package com.bookstore.store;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@CrossOrigin(origins = "http://localhost:3000/")
@Controller
public class MainController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/books")
    public String books() {
        return "books";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/signup")
    public String signup() {
        return "signup";
    }


    @GetMapping("/books/cart")
    public String cart() {
        return "books/cart";
    }

    @GetMapping("/books/{id}")
    public String subBook() {
        return "books/[id]";
    }

    @GetMapping("test")
    public String test() {return  "test";}



}
