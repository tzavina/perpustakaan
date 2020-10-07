package com.example.Perpustakaan.service;

import com.example.Perpustakaan.entity.Book;

import java.util.List;

public interface BookService {
    List<Book> findAllBooks();
    Book findBookById(Long id);
    Book saveOrUpdateBook(Book book);
    void deleteBook(Long id);
}
