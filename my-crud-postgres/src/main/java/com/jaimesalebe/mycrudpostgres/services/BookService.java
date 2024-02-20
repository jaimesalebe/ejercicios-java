package com.jaimesalebe.mycrudpostgres.services;

import com.jaimesalebe.mycrudpostgres.model.Book;
import com.jaimesalebe.mycrudpostgres.repositories.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository repository;

    public BookService(BookRepository repository) {
        this.repository = repository;
    }

    public List<Book> getAllBooks() {
        return repository.getAllBooks();
    }
}
