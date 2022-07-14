package com.bookstore.store.author;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping(path = "api/authors")
public class AuthorController {
    private final AuthorService authorService;

    @Autowired
    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping
    public List<Author> getAuthors() {
        return authorService.getAuthors();
    }

    @GetMapping(path = "{id}")
    public Optional<Author> getAuthorById(@PathVariable("id") int authorId) {
        return authorService.getAuthor(authorId);
    }

    @PostMapping
    public void newAuthor(@RequestBody Author author) {
        authorService.addNewAuthor(author);
    }

    @DeleteMapping(path = "{authorId}")
    public void delAuthor(@PathVariable("authorId") int authorId) {
        authorService.deleteAuthor(authorId);
    }

    @PutMapping(path = "{authorId}")
    public void updateAuthorById(
            @PathVariable("authorId") int id,
            @RequestParam(required = false) String firstName,
            @RequestParam(required = false) String lastName
    ) {
        authorService.updateAuthor(id, firstName, lastName);
    }
}
