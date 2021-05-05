package com.example.springdockerkubernetes.controller;

import com.example.springdockerkubernetes.entities.Book;
import com.example.springdockerkubernetes.service.BookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
@Slf4j
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping(method = RequestMethod.POST)
    public Book create(@RequestBody Book book) {
        return bookService.saveBook(book);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Book> get() {
        return bookService.getBooks();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public Book get(@PathVariable Long id) {
        return bookService.getBook(id);
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "/{id}")
    public void delete(@PathVariable Long id) {
        bookService.deleteBook(id);
    }
}
