package com.frank.springframework5.spring5webapp.repositories;

import com.frank.springframework5.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
