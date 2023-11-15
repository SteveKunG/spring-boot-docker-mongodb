package com.stevekung.springbootdockermongodb;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.stevekung.springbootdockermongodb.dao.BookRepository;
import com.stevekung.springbootdockermongodb.model.Book;

@RestController
@RequestMapping("/api/v1/book")
public record BookController(BookRepository bookRepository)
{
    @PostMapping
    public ResponseEntity<String> add(@RequestBody Book book)
    {
        bookRepository.save(book);
        return new ResponseEntity<>(book.toString(), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Book>> get()
    {
        return new ResponseEntity<>(bookRepository.findAll(), HttpStatus.OK);
    }
}