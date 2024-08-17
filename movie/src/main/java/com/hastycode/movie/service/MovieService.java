package com.hastycode.movie.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
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
        var headers = new HttpHeaders();

        headers.set("x-rapidapi-key", apiKey);
        headers.set("x-rapidapi-host", apiHost);
        HttpEntity<String> requestEntity = new HttpEntity<>(headers);

        log.info("these are the headers sent {}", requestEntity);

        var response = restTemplate.exchange(url, HttpMethod.GET, requestEntity, String.class);
        return response.getBody();
    }
}
