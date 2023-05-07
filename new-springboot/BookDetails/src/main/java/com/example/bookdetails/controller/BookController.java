package com.example.bookdetails.controller;

import com.example.bookdetails.entity.Book;
import com.example.bookdetails.repository.BookRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookRespository bookRespository;

    // POST
    @PostMapping("/addbook")
    public ResponseEntity<Book> addBookDetails(@RequestBody Book book) {
        Book savedBook = bookRespository.save(book);
        return new ResponseEntity<>(savedBook, HttpStatus.OK);
//        return new ResponseEntity<>(savedBook, HttpStatus.CREATED);
//        return ResponseEntity.ok().body(book);
    }


    // GET
    @GetMapping("/getbook/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable Long id) {
        Optional<Book> book = bookRespository.findById(id);

        if(book.isPresent()) {
            return new ResponseEntity<>(book.get(), HttpStatus.OK);
//            return ResponseEntity.ok().body(book.get());
        } else {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }


    // PUT
    @PutMapping("/updatebook/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable Long id, @RequestBody Book book) {
        Optional<Book> bookOptional = bookRespository.findById(id);

        if(bookOptional.isPresent()) {

            Book updatedBook = bookOptional.get();

            updatedBook.setName(book.getName());
            updatedBook.setAuthor(book.getAuthor());
            updatedBook.setPrice(book.getPrice());

            bookRespository.save(updatedBook);

            return new ResponseEntity<>(updatedBook, HttpStatus.OK);

        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }


    // DELETE MAPPING
    @DeleteMapping("/deletebook/{id}")
    public ResponseEntity<Book> deleteBook(@PathVariable Long id) {
        Optional<Book> book = bookRespository.findById(id);

        if(book.isPresent()) {

            Book bookToBeDeleted = book.get();
            bookRespository.delete(bookToBeDeleted);

            return new ResponseEntity<>(bookToBeDeleted, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


}
