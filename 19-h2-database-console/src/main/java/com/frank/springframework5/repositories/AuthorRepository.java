package com.frank.springframework5.repositories;

import com.frank.springframework5.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
