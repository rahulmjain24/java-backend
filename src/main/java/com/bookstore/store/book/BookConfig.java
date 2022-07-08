package com.bookstore.store.book;

import com.bookstore.store.author.Author;
import com.bookstore.store.genre.Genre;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BookConfig {

    @Bean
    CommandLineRunner bookRunner(BookRepository repository) {
        return args -> {
            Book book = new Book(
                    "title",
                    2001,
                    "",
                    new Author(),
                    new Genre()
            );
        };
    }
}
