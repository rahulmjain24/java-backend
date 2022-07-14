package com.bookstore.store.user;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RoleConfig {

    @Bean
    CommandLineRunner roleRunner(RoleRepository repository) {
        return args -> {
            Role role = new Role(
                    "gaurav",
                    "ROLE_ADMIN"
            );
        };
    }
}
