package com.laliga.footballstats.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlayerMatchStatsCreateRequest {

    @NotNull(message = "Player ID is required")
    private Long playerId;

    @NotNull(message = "Match ID is required")
    private Long matchId;

    @Min(value = 0, message = "Minutes played must be at least 0")
    @Max(value = 120, message = "Minutes played cannot exceed 120")
    private Integer minutesPlayed;

    @Min(value = 0, message = "Goals cannot be negative")
    private Integer goals;

    @Min(value = 0, message = "Assists cannot be negative")
    private Integer assists;

    @Min(value = 0, message = "Yellow cards cannot be negative")
    @Max(value = 2, message = "Yellow cards cannot exceed 2")
    private Integer yellowCards;

    @Min(value = 0, message = "Red cards cannot be negative")
    @Max(value = 1, message = "Red cards cannot exceed 1")
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

    @Min(value = 0, message = "Rating cannot be negative")
    @Max(value = 10, message = "Rating cannot exceed 10")
    private Double rating;

    private Boolean wasStarter;
    private Boolean wasSubstitute;

    // Goalkeeper-specific fields
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