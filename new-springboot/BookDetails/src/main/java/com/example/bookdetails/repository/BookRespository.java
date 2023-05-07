package com.example.bookdetails.repository;

import com.example.bookdetails.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRespository extends JpaRepository<Book, Long> {
}
