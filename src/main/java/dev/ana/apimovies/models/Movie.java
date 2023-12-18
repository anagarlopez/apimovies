package dev.ana.apimovies.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "movies")
public class Movie {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "id_movie")
    private Long id;

    private String name;
    private int year;
    private String description;
    private int running_time;
    private String genre;
    private String main_actor;
    

    public Movie() {
    }

    public Movie(String name) {
        this.name = name;    
    }

    public Long getId() {
        return Id;    
    }
    public Long setId(Long Id) {
        this.id = id;    
    }

 }
