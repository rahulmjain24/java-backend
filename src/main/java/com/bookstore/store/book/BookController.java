package com.bookstore.store.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping(path = "api/books")
public class BookController {
    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public Page<Book> getBooks(@RequestParam int page) {
        return bookService.getBooks(page);
    }

    @GetMapping(params = "title")
    public List<Book> getBookByTitle(@RequestParam String title) {return  bookService.getBookByTitle(title);}
    @GetMapping(path = "{id}")
    public Optional<Book> getBookById(@PathVariable("id") int bookId) {
        return bookService.getBook(bookId);
    }

    @PostMapping
    public void newBook(@RequestBody Book book) {
        bookService.addNewBook(book);
    }
}
