package com.example.Perpustakaan.service.impl;

import com.example.Perpustakaan.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Perpustakaan.repository.BookRepository;
import com.example.Perpustakaan.service.BookService;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookRepository bookRepository;

    @Override
    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book findBookById(Long id) {
        Book book = bookRepository.findById(id).orElse(new Book());
        return book;
    }

    @Override
    public Book saveOrUpdateBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public void deleteBook(Long id) {
        Book book = bookRepository.findById(id).orElse(new Book());
        bookRepository.delete(book);

    }
}
