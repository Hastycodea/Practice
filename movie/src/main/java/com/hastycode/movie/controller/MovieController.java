package com.hastycode.movie.controller;

import com.hastycode.movie.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MovieController {

    private MovieService service;

    @GetMapping("/")
    public String home() {
        return "Welcome to movies";
    }

    @GetMapping("/movies")
    public String getMovieDetails(@RequestParam String name) {
        return service.getMovieDetails(name);
    }
}
