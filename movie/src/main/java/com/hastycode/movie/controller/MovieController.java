package com.hastycode.movie.controller;

import com.hastycode.movie.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/movies")
public class MovieController {

    private final MovieService service;

    @GetMapping("/test")
    public String home() {
        return "Welcome to movies";
    }

    @GetMapping()
    public String getMovieDetails(@RequestParam String name) {
        return service.getMovieDetails(name);
    }
}
