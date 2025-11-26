package com.laliga.footballstats.dto.prediction;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PredictionRequest {
    private Long playerId;
    private Integer matchesToPredict;
    private Integer historicalMatches;
}