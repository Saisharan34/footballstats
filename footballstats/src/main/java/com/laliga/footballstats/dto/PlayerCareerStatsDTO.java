package com.laliga.footballstats.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PlayerCareerStatsDTO {
    private Long totalMatches;
    private Long totalGoals;
    private Long totalAssists;
    private Double averageRating;
    private Long totalMinutesPlayed;
    private Long totalYellowCards;
    private Long totalRedCards;
    private Double goalsPerMatch;
    private Double assistsPerMatch;
    private Double passCompletionRate;

    // Goalkeeper-specific
    private Long totalSaves;
    private Long totalCleanSheets;
    private Double savePercentage;
    private Double goalsConceededPerMatch;
}