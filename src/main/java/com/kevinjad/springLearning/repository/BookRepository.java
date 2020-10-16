package com.kevinjad.springLearning.repository;

import com.kevinjad.springLearning.models.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book,Long> {

}
