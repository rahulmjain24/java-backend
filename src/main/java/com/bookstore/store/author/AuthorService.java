package com.bookstore.store.author;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class AuthorService {
    private final AuthorRepository authorRepository;

    @Autowired
    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public List<Author> getAuthors() {
        return authorRepository.findAll();
    }

    public Optional<Author> getAuthor(int id) {
        return authorRepository.findById(id);
    }

    public void addNewAuthor(Author author) {
        System.out.println(author);
        authorRepository.save(author);
    }

    public void deleteAuthor(int authorId) {
        boolean exists = authorRepository.existsById(authorId);
        if(!exists) {
            throw new IllegalStateException("Author doesn't exist");
        } else {
            authorRepository.deleteById(authorId);
        }
    }

    @Transactional
    public void updateAuthor(int id, String firstName, String lastName) {
        Author author = authorRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException("Author with id "+id+" doesn't exist.")
        );

        if(firstName != null && firstName.length() > 0 && !Objects.equals(author.getFirstName(),firstName))
            author.setFirstName(firstName);

        if(lastName != null && lastName.length() > 0 && !Objects.equals(author.getLastName(),lastName))
            author.setLastName(lastName);
    }
}
