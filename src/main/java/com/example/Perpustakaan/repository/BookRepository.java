package com.example.Perpustakaan.repository;

import com.example.Perpustakaan.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}