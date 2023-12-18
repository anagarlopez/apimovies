package dev.ana.apimovies.controllers;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.ana.apimovies.services.MovieService;

import dev.ana.apimovies.models.Movie;

@RestController
@RequestMapping(path = "${api-endpoint}/movies")
public class MovieController {

    MovieService service;

    public MoviesController(MovieService service) {
        this.service = service;
    }

    @GetMapping(path = "")
    public List<Movie> index() {

        List<Movie> movies = service.getAll();
        return movies;
        
    }
}