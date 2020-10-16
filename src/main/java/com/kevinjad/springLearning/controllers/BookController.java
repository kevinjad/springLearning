package com.kevinjad.springLearning.controllers;

import com.kevinjad.springLearning.models.Book;
import com.kevinjad.springLearning.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @Autowired
    BookRepository bookRepository;

    @PostMapping("book")
    public void getBooks(@RequestBody Book book){
        bookRepository.save(book);
    }
}
