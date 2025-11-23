package com.laliga.footballstats.controller;

import com.laliga.footballstats.service.FootballApiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FootballController {

    private final FootballApiService footballApiService;

    public FootballController(FootballApiService footballApiService) {
        this.footballApiService = footballApiService;
    }

    @GetMapping("/laliga/matches")
    public String getLaLigaMatches() {
        return footballApiService.getLaLigaMatches();
    }
}
