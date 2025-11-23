package com.laliga.footballstats.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

@Configuration
public class FootballApiConfig {

    @Value("${football.api.key}")
    private String apiKey;

    @Bean(name = "footballRestTemplate")
    public RestTemplate footballRestTemplate() {
        RestTemplate restTemplate = new RestTemplate();

        // Add the API key to every request
        restTemplate.setInterceptors(Collections.singletonList(
                (request, body, execution) -> {
                    request.getHeaders().add("X-Auth-Token", apiKey);
                    return execution.execute(request, body);
                }
        ));

        return restTemplate;
    }
}
