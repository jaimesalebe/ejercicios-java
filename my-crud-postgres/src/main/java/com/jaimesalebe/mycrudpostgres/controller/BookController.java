package com.jaimesalebe.mycrudpostgres.controller;

import com.jaimesalebe.mycrudpostgres.model.Book;
import com.jaimesalebe.mycrudpostgres.services.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/book")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }
}
