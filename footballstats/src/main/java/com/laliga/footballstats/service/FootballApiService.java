package com.laliga.footballstats.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FootballApiService {

    private final RestTemplate restTemplate;

    @Value("${football.api.base-url}")
    private String baseUrl;

    public FootballApiService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    // Example: Get La Liga matches
    public String getLaLigaMatches() {
        String url = baseUrl + "/competitions/PD/matches"; // PD = La Liga
        return restTemplate.getForObject(url, String.class);
    }
}
