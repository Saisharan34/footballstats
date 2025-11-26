package com.laliga.footballstats.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MatchCreateRequest {

    @NotNull(message = "Home team ID is required")
    private Long homeTeamId;

    @NotNull(message = "Away team ID is required")
    private Long awayTeamId;

    @NotNull(message = "Match date is required")
    private LocalDateTime matchDate;

    private Integer homeScore;
    private Integer awayScore;

    @NotNull(message = "Season is required")
    private String season;

    private Integer matchWeek;
    private String competition;
    private String status;
    private String venue;
    private String referee;
    private Long apiId;
}