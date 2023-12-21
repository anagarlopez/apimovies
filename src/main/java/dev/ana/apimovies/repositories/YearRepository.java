package dev.ana.apimovies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.ana.apimovies.models.Year;

public interface YearRepository extends JpaRepository<Year,Long> {

    
}
