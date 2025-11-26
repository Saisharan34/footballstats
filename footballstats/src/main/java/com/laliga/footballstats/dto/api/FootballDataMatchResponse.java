package com.laliga.footballstats.dto.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class FootballDataMatchResponse {
    private Long id;

    @JsonProperty("utcDate")
    private String utcDate;

    private String status;

    private Integer matchday;

    private String stage;

    @JsonProperty("homeTeam")
    private TeamInfo homeTeam;

    @JsonProperty("awayTeam")
    private TeamInfo awayTeam;

    private Score score;

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class TeamInfo {
        private Long id;
        private String name;

        @JsonProperty("shortName")
        private String shortName;

        private String tla;

        @JsonProperty("crest")
        private String crest;
    }

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Score {
        private String winner;
        private String duration;

        @JsonProperty("fullTime")
        private ScoreDetail fullTime;

        @JsonProperty("halfTime")
        private ScoreDetail halfTime;
    }

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ScoreDetail {
        private Integer home;
        private Integer away;
    }
}