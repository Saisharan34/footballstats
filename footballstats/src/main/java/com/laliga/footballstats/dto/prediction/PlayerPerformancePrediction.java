package com.laliga.footballstats.dto.prediction;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PlayerPerformancePrediction {
    private Long playerId;
    private String playerName;
    private String position;

    private List<DataPoint> historicalPerformance;
    private List<DataPoint> predictedPerformance;

    private PredictionMetrics metrics;

    private String trendDirection;
    private Double confidenceScore;

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class DataPoint {
        private Integer matchNumber;
        private Double rating;
        private Integer goals;
        private Integer assists;
        private Double goalsPerMatch;
        private Double assistsPerMatch;

        // Goalkeeper-specific
        private Integer saves;
        private Integer cleanSheets;
        private Integer goalsConceded;
    }

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class PredictionMetrics {
        private Double averageHistoricalRating;
        private Double predictedAverageRating;
        private Double expectedGoalsNext5Matches;
        private Double expectedAssistsNext5Matches;
        private Double formTrend;
        private Double consistency;
        private String predictionMethod;

        // Goalkeeper-specific
        private Double expectedSavesNext5Matches;
        private Double expectedCleanSheetsNext5Matches;
        private Double expectedSavePercentage;
    }
}