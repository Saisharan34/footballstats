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
public class PositionMetrics {
    private String position;
    private Map<String, MetricScore> metrics;
    private Double overallScore;
    private String ranking;

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class MetricScore {
        private String metricName;
        private Double value;
        private Double weight;
        private Double normalizedScore;
        private String interpretation;
    }
}
