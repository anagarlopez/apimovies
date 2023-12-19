package dev.ana.apimovies.controllers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;;

@RestController

public class HomeController {
    @GetMapping(path = "/")
    public String index() {
        return "Hello world";
    }
}
