package services;

import org.hibernate.mapping.List;
import org.springframework.stereotype.Service;

import dev.ana.apimovies.repositories.MovieRepository;
import.dev.ana.apimovies.

@Service
public class MovieService {

    MovieRepository repository;

    public MovieRepository(MovieRepository repository) {
        this.repository = repository;
    }
    
    public List<Movie> getAll() {
        List<Movie> movies = repository.findAll();
        return movies;
    }

    public Movie getById(Long id) throws Exception {
        Movie movie = repository.findById(id).orElseThrow(()) -> new MovieNotFoundExcepcion
    }
}
