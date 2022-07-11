package com.bookstore.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

@SpringBootApplication
public class StoreApplication {
	static Authentication auth= SecurityContextHolder.getContext().getAuthentication();
	public static void main(String[] args) {

		SpringApplication.run(StoreApplication.class, args);
	}

}
