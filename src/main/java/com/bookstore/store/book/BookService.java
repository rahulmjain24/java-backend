package com.bookstore.store.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Page<Book> getBooks(int a) {
        return bookRepository.findAll(PageRequest.of(a,8));
    }


    public List<Book> getBookByTitle(String title) {return bookRepository.findAllByTitleLike("%"+title+"%");}

    public Optional<Book> getBook(int id) {
        return bookRepository.findById(id);
    }


    public void addNewBook(Book book) {
        System.out.println(book);
        bookRepository.save(book);
    }



}
