package com.laliga.footballstats.dto.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class FootballDataTeamResponse {
    private Long id;
    private String name;

    @JsonProperty("shortName")
    private String shortName;

    private String tla;

    @JsonProperty("crest")
    private String logoUrl;

    private String address;
    private String website;
    private Integer founded;
    private String clubColors;
    private String venue;
}