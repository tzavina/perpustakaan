package com.example.Perpustakaan.controller;


import com.example.Perpustakaan.entity.Book;
import com.example.Perpustakaan.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("api/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks() {
        return new ResponseEntity<>(bookService.findAllBooks(), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Book> saveBook (@Validated @RequestBody Book book) {
        return new ResponseEntity<>(bookService.saveOrUpdateBook(book),
                HttpStatus.OK);
    }
    @GetMapping ("/{id}")
    public ResponseEntity<Book> getOneBook(@PathVariable Long id) throws Exception {
        return new ResponseEntity<Book>(bookService.findBookById(id), HttpStatus.OK);
    }
    @DeleteMapping ("/{id}")
    public String deleteBook(@PathVariable Long id) {
        bookService.deleteBook(id);
        return "delete sukses";
    }
}
