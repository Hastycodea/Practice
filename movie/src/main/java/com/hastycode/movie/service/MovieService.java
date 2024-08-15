package com.hastycode.movie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MovieService {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${movie.api.key}")
    private String apiKey;

    @Value("${movie.api.url}")
    private String apiUrl;

    @Value("${movie.api.host}")
    private String apiHost;

    public String getMovieDetails(String name) {
        String url = apiUrl + "?s=" + name + "&r=json&page=1";

        return restTemplate.getForObject(url, String.class);
    }
}
