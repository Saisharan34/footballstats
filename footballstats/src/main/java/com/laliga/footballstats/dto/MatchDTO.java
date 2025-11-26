package com.laliga.footballstats.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MatchDTO {
    private Long id;
    private TeamDTO homeTeam;
    private TeamDTO awayTeam;
    private LocalDateTime matchDate;
    private Integer homeScore;
    private Integer awayScore;
    private String season;
    private Integer matchWeek;
    private String competition;
    private String status;
    private String venue;
    private String referee;
    private Long apiId;
}