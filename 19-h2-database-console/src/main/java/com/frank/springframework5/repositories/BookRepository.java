package com.frank.springframework5.repositories;

import com.frank.springframework5.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
