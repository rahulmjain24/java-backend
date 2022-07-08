package com.bookstore.store.genre;

import javax.persistence.*;

@Entity
@Table(name = "genres")
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "genre_id")
    private int id;
    @Column(name = "genre")
    private String genre;

    public Genre() {
    }

    public Genre(String genre) {
        this.genre = genre;
    }

    //getters
    public int getId() {
        return id;
    }

    public String getGenre() {
        return genre;
    }

    //setters

    public void setId(int id) {
        this.id = id;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Genre{" +
                "id=" + id +
                ", genre='" + genre + '\'' +
                '}';
    }
}
