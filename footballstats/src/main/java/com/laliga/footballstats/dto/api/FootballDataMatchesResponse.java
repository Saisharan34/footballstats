package com.laliga.footballstats.dto.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class FootballDataMatchesResponse {
    private List<FootballDataMatchResponse> matches;
}