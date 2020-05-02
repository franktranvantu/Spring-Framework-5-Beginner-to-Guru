package com.frank.springframework5.spring5webapp.bootstrap;

import com.frank.springframework5.spring5webapp.domain.Author;
import com.frank.springframework5.spring5webapp.domain.Book;
import com.frank.springframework5.spring5webapp.repositories.AuthorRepository;
import com.frank.springframework5.spring5webapp.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author frank = new Author("Frank", "Tran");
        Book java = new Book("Java Programming", "123456");
        frank.getBooks().add(java);
        java.getAuthors().add(frank);

        authorRepository.save(frank);
        bookRepository.save(java);

        Author patrik = new Author("Patrik", "Nguyen");
        Book designPattern = new Book("Java Design Pattern", "481628");
        patrik.getBooks().add(designPattern);
        designPattern.getAuthors().add(patrik);

        authorRepository.save(patrik);
        bookRepository.save(designPattern);

        System.out.println("Number of Books: " + bookRepository.count());
    }
}
