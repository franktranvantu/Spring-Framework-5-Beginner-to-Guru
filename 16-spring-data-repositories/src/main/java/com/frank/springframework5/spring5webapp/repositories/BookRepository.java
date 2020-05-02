package com.frank.springframework5.spring5webapp.repositories;

import com.frank.springframework5.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
