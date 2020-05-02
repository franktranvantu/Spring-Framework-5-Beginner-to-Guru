package com.frank.springframework5.spring5webapp.repositories;

import com.frank.springframework5.spring5webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
