package com.example.springdockerkubernetes.service;

import com.example.springdockerkubernetes.entities.Book;
import com.example.springdockerkubernetes.repository.BookRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public Book saveBook(Book book) {
        log.info("Received {} ", book);
        Book savedBook = bookRepository.save(book);
        log.info("Saved {} ", book);
        return savedBook;
    }

    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    public Book getBook(Long id) {
        return bookRepository.findById(id).orElseThrow(() -> new RuntimeException(String.format("Book with %s not found", id)));
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}
