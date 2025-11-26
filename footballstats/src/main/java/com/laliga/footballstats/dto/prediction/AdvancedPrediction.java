package com.laliga.footballstats.dto.prediction;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AdvancedPrediction {
    private Long playerId;
    private String playerName;

    private Double predictedRatingNextMatch;
    private Double predictedGoalsNextMatch;
    private Double predictedAssistsNextMatch;

    // Goalkeeper-specific
    private Double predictedSavesNextMatch;
    private Double predictedSavePercentage;
    private Double predictedCleanSheetProbability;

    private ConfidenceInterval ratingInterval;
    private ConfidenceInterval goalsInterval;

    private Map<String, Double> performanceIndicators;

    private ComparisonMetrics teamComparison;

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ConfidenceInterval {
        private Double lower;
        private Double predicted;
        private Double upper;
    }

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ComparisonMetrics {
        private Double playerAverage;
        private Double teamAverage;
        private Double percentageAboveTeam;
        private String ranking;
    }
}