package com.bookstore.store.cart;

import com.bookstore.store.author.Author;
import com.bookstore.store.user.User;

import javax.persistence.*;
import java.awt.print.Book;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "cart")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "item_id")
    private int itemId;

    @ManyToMany
    @JoinTable(
            name = "users",
            joinColumns = @JoinColumn(name = "item_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    private Set<User> users = new HashSet<>();

    private Set<Book> books = new HashSet<>();

    public int getItemId() {
        return itemId;
    }

    public Set<User> getUsers() {
        return users;
    }

    public Set<Book> getBooks() {
        return books;
    }
}
