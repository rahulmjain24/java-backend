package com.bookstore.store.book;

import com.bookstore.store.author.Author;
import com.bookstore.store.genre.Genre;
import com.bookstore.store.user.User;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="book_id")
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "year")
    private int year;

    @Column(name = "synopsis")
    private String synopsis;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "author_id", referencedColumnName = "author_id")
    private Author author;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "genre_id", referencedColumnName = "genre_id")
    private Genre genre;

    @JsonIgnore
    @ManyToMany(mappedBy = "booksBought")
    private Set<User> users = new HashSet<>();



    public Book() {
    }



    public Book(String title, int year, Author author, Genre genre) {
        this.title = title;
        this.year = year;
        this.author = author;
        this.genre = genre;
    }

    public Book(String title, int year, String synopsis, Author author, Genre genre) {
        this.title = title;
        this.year = year;
        this.synopsis = synopsis;
        this.author = author;
        this.genre = genre;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public Author getAuthor() {
        return author;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Set<User> getUsers() {
        return users;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", year=" + year +
                ", synopsis='" + synopsis + '\'' +
                ", author=" + author +
                ", genre=" + genre +
                '}';
    }
}
