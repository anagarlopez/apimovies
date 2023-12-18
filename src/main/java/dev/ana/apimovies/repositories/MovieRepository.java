package dev.ana.apimovies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import dev.ana.apimovies.models.Movie;

public interface MovieRepository extends JpaRepository<Movie,Long> {
    
}
