package com.example.moviedatabase.service;

import com.example.moviedatabase.entity.Movies;
import com.example.moviedatabase.repository.MoviesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MoviesService {

    @Autowired
    private MoviesRepository moviesRepository;


    public List<String> getTheMovieNamesByYear(String year) {

        List<Movies> moviesList = moviesRepository.findAllByYear(year);

        if (moviesList != null) {
            List<String> movieNames = new ArrayList<>();

            moviesList.forEach(item -> {
                movieNames.add(item.getName());
            });

            return movieNames;
        }

        return null;

    }

    public Map<String, String> getTheMovieWithDirector(String year) {

        List<Movies> moviesList = moviesRepository.findAllByYear(year);

        if (moviesList != null) {

            Map<String, String> movieNamesWithDirector = new HashMap<>();

            moviesList.forEach(item -> {
                movieNamesWithDirector.put(item.getName(), item.getDirector());
            });

            return movieNamesWithDirector;
        }

        return null;
    }

    public List<String> getTheMoviesByGenre(String genre) {

        List<Movies> moviesList = moviesRepository.findAll();

        List<String> genreMovieList = new ArrayList<>();

        moviesList.forEach(item -> {
            if((item.getGenre() != null) && (item.getGenre().toLowerCase().contains(genre.toLowerCase()))) {
                genreMovieList.add(item.getName());
            }
        });

        return genreMovieList;

    }
}
