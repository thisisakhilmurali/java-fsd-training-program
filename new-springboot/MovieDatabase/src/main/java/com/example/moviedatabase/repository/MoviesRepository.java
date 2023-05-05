package com.example.moviedatabase.repository;

import com.example.moviedatabase.entity.Movies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MoviesRepository extends JpaRepository<Movies, Integer> {

    List<Movies> findAllByYear(String year);

}
