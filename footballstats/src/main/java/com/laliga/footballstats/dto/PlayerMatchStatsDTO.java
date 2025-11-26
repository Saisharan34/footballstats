package com.laliga.footballstats.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PlayerMatchStatsDTO {
    private Long id;
    private Long playerId;
    private String playerName;
    private Long matchId;
    private MatchSummaryDTO match;
    private Integer minutesPlayed;
    private Integer goals;
    private Integer assists;
    private Integer yellowCards;
    private Integer redCards;
    private Integer shots;
    private Integer shotsOnTarget;
    private Integer passes;
    private Integer passesCompleted;
    private Integer tackles;
    private Integer tacklesWon;
    private Integer interceptions;
    private Integer fouls;
    private Integer foulsDrawn;
    private Integer dribbles;
    private Integer dribblesSuccessful;
    private Double rating;
    private Boolean wasStarter;
    private Boolean wasSubstitute;
    private Double passCompletionRate;
    private Double shotAccuracy;

    // Goalkeeper-specific
    private Integer saves;
    private Integer savesFromInsideBox;
    private Integer savesFromOutsideBox;
    private Integer penaltiesSaved;
    private Integer penaltiesFaced;
    private Boolean cleanSheet;
    private Integer goalsConceded;
    private Integer punches;
    private Integer highClaims;
    private Integer catches;
    private Integer throwOuts;
    private Integer goalKicks;
}