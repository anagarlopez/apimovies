package dev.ana.apimovies.services;

import java.util.List;

import org.springframework.stereotype.Service;

import dev.ana.apimovies.models.Movie;
import dev.ana.apimovies.repositories.MovieRepository;

@Service
public class MovieService {

    MovieRepository repository;

    public MovieService(MovieRepository repository) {
        this.repository = repository;
    }
    
    public List<Movie> getAll() {
        List<Movie> movies = repository.findAll();
        return movies;
    }

}
