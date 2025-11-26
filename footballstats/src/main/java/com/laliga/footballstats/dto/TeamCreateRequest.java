package com.laliga.footballstats.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TeamCreateRequest {

    @NotBlank(message = "Team name is required")
    @Size(min = 2, max = 100, message = "Team name must be between 2 and 100 characters")
    private String name;

    @Size(max = 50, message = "Short name must be at most 50 characters")
    private String shortName;

    private String country;

    @NotBlank(message = "League is required")
    private String league;

    private String logoUrl;
    private Integer foundedYear;
    private String stadiumName;
    private Long apiId;
}