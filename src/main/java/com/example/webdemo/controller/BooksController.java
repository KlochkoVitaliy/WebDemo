package com.example.webdemo.controller;

import com.example.webdemo.model.Book;
import com.example.webdemo.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BooksController {
    private final BookService bookService;

    public BooksController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/{id}") // http://localhost:8080/books/23
    public Book getBookInfo(@PathVariable Long id) {
        return bookService.finalBook(id);
    }

    @PostMapping()// http://localhost:8080/books
    public Book createBook(Book book) {
        return bookService.createBook(book);
    }
}
