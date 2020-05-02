package com.frank.springframework5.spring5webapp.bootstrap;

import com.frank.springframework5.spring5webapp.domain.Author;
import com.frank.springframework5.spring5webapp.domain.Book;
import com.frank.springframework5.spring5webapp.domain.Publisher;
import com.frank.springframework5.spring5webapp.repositories.AuthorRepository;
import com.frank.springframework5.spring5webapp.repositories.BookRepository;
import com.frank.springframework5.spring5webapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Publisher code88 = new Publisher();
        code88.setName("Code 88");
        code88.setAddressLine1("02 Truong Son");
        code88.setCity("Ho Chi Minh");

        publisherRepository.save(code88);

        System.out.println("Publisher Count: " + publisherRepository.count());


        Author frank = new Author("Frank", "Tran");
        Book java = new Book("Java Programming", "123456");
        frank.getBooks().add(java);
        java.getAuthors().add(frank);
        code88.getBooks().add(java);
        java.setPublisher(code88);

        authorRepository.save(frank);
        bookRepository.save(java);
        publisherRepository.save(code88);

        Author patrik = new Author("Patrik", "Nguyen");
        Book designPattern = new Book("Java Design Pattern", "481628");
        patrik.getBooks().add(designPattern);
        designPattern.getAuthors().add(patrik);
        code88.getBooks().add(designPattern);
        designPattern.setPublisher(code88);

        authorRepository.save(patrik);
        bookRepository.save(designPattern);
        publisherRepository.save(code88);

        System.out.println("Number of Books: " + bookRepository.count());
        System.out.println("Publisher Number of Books: " + code88.getBooks().size());
    }
}
