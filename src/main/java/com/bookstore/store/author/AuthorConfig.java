package com.bookstore.store.author;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AuthorConfig {

    @Bean
    CommandLineRunner commandLineRunner(AuthorRepository repository) {
        return args -> {
            Author author = new Author(
                    "Yukio",
                    "Mishima"
            );
        };
    }
}
