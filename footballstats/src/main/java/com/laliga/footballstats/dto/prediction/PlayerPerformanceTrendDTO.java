package com.laliga.footballstats.dto.prediction;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PlayerPerformanceTrendDTO {
    private Long playerId;
    private String playerName;
    private List<PerformanceDataPoint> performanceHistory;
    private List<PerformanceDataPoint> predictedPerformance;
    private String trendDirection;

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class PerformanceDataPoint {
        private LocalDateTime date;
        private Double rating;
        private Integer goals;
        private Integer assists;
        private Integer saves;
        private Boolean cleanSheet;
    }
}