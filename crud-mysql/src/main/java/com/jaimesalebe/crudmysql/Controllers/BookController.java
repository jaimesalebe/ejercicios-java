package com.jaimesalebe.crudmysql.Controllers;

import com.jaimesalebe.crudmysql.Entities.Book;
import com.jaimesalebe.crudmysql.Services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/{id}")
    public Optional<Book> getOneBook(@PathVariable long id) {
        return bookService.getOneBook(id);
    }

    @PostMapping
    public List<Book> createBook(@RequestBody Book book) {
        bookService.createUpdateBook(book);
        return bookService.getAllBooks();
    }

    @DeleteMapping("/{id}")
    public List<Book> deleteBook(@PathVariable Long id) {
        bookService.deleteBook(id);
        return bookService.getAllBooks();
    }

    @PatchMapping("/{id}")
    public Optional<Book> updateBook(@PathVariable Long id, @RequestBody Book book) {
        bookService.updateBook(id, book);
        return bookService.getOneBook(id);
    }
}
