package com.example.moviedatabase.controller;

import com.example.moviedatabase.service.MoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/movie")
public class MoviesController {

    @Autowired
    private MoviesService moviesService;

    @GetMapping("/year/{year}")
    public List<String> getTheMovieNamesByYear(@PathVariable String year) {
        return moviesService.getTheMovieNamesByYear(year);
    }

    @GetMapping("/moviewithdir/{year}")
    public Map<String, String> getTheMovieWithDirector(@PathVariable String year) {
        return moviesService.getTheMovieWithDirector(year);
    }

    @GetMapping("/genre/{genre}")
    public List<String> getTheMoviesByGenre(@PathVariable String genre) {
        return moviesService.getTheMoviesByGenre(genre);
    }

}
