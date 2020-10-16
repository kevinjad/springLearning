package com.kevinjad.springLearning.controllers;

import com.kevinjad.springLearning.models.Author;
import com.kevinjad.springLearning.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorController {

    @Autowired
    private AuthorRepository authorRepository;

    @PostMapping("author")
    public void addAuthors(@RequestBody Author author){
        authorRepository.save(author);
    }
}
