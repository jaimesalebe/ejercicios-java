package com.jaimesalebe.crudmysql.Controllers;

import com.jaimesalebe.crudmysql.Entities.Book;
import com.jaimesalebe.crudmysql.Services.BookService;
import com.jaimesalebe.crudmysql.Services.IStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @Autowired
    private IStorageService storeService;

    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/{id}")
    public Optional<Book> getOneBook(@PathVariable long id) {
        return bookService.getOneBook(id);
    }

    @PostMapping
    public List<Book> createBook(@RequestParam("file") MultipartFile file,
                                 @RequestParam("title") String title,
                                 @RequestParam("author") String author) {
        String imageUrl = storeService.saveImage(file);
        Book book = new Book();
        book.setTitle(title);
        book.setAuthor(author);
        book.setImageUrl(imageUrl);

        bookService.createBook(book);
        return bookService.getAllBooks();
    }

    @DeleteMapping("/{id}")
    public List<Book> deleteBook(@PathVariable Long id) {
        bookService.deleteBook(id);
        return bookService.getAllBooks();
    }

    @PutMapping("/{id}")
    public Optional<Book> updateBook(@PathVariable Long id,
                                     @RequestParam("file") MultipartFile file,
                                     @RequestParam("title") String title,
                                     @RequestParam("author") String author) {
        String imageUrl = storeService.saveImage(file);

        Book book = new Book();
        book.setTitle(title);
        book.setAuthor(author);
        book.setImageUrl(imageUrl);

        bookService.updateBook(id, book);
        return bookService.getOneBook(id);
    }
}
