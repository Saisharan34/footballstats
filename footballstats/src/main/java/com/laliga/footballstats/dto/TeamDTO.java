package com.laliga.footballstats.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TeamDTO {
    private Long id;
    private String name;
    private String shortName;
    private String country;
    private String league;
    private String logoUrl;
    private Integer foundedYear;
    private String stadiumName;
    private Long apiId;
}