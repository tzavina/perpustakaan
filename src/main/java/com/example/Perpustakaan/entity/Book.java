package com.example.Perpustakaan.entity;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;

@Slf4j
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity

public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (nullable = false)
    private String tittle;


    @Column (nullable = false)
    private String writer;

    @Column (nullable = false)
    private  String isbn;


}
