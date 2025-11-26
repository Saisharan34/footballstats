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
public class MatchSummaryDTO {
    private Long id;
    private String homeTeamName;
    private String awayTeamName;
    private LocalDateTime matchDate;
    private Integer homeScore;
    private Integer awayScore;
    private String status;
}