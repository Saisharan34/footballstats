package com.laliga.footballstats.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PlayerDTO {
    private Long id;
    private String name;
    private LocalDate dateOfBirth;
    private Integer age;
    private String nationality;
    private String position;
    private Integer jerseyNumber;
    private Integer heightCm;
    private Integer weightKg;
    private String preferredFoot;
    private String photoUrl;
    private Long teamId;
    private String teamName;
    private Long apiId;
    private Long marketValue;
    private LocalDate contractUntil;
}