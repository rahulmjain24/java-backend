package com.bookstore.store.book;

import com.bookstore.store.author.Author;
import com.bookstore.store.genre.Genre;

import javax.persistence.*;

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

    @ManyToOne
    @JoinColumn(name = "author_id")
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Author author;

    @ManyToOne
    @JoinColumn(name = "genre_id")
    private Genre genre;

    public Book() {
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
