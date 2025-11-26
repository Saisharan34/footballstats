package com.laliga.footballstats.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PlayerSummaryDTO {
    private Long id;
    private String name;
    private String position;
    private Integer jerseyNumber;
    private String nationality;
}