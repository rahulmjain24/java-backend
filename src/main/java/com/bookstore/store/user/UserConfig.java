package com.bookstore.store.user;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    @Bean
    CommandLineRunner userRunner(UserRepository repository) {
        return args -> {
            User author = new User(
                    "rahul",
                    "Rahul Jain",
                    "rahulmjain24@outlook.com",
                    "rahul123",
                    "MALE"
            );
        };
    }
}
