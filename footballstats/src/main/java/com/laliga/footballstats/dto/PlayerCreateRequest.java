package com.laliga.footballstats.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlayerCreateRequest {

    @NotBlank(message = "Player name is required")
    private String name;

    private LocalDate dateOfBirth;
    private String nationality;

    @NotBlank(message = "Position is required")
    @Pattern(regexp = "GK|DEF|MID|FWD", message = "Position must be GK, DEF, MID, or FWD")
    private String position;

    private Integer jerseyNumber;
    private Integer heightCm;
    private Integer weightKg;

    @Pattern(regexp = "Left|Right|Both", message = "Preferred foot must be Left, Right, or Both")
    private String preferredFoot;

    private String photoUrl;

    @NotNull(message = "Team ID is required")
    private Long teamId;

    private Long apiId;
    private Long marketValue;
    private LocalDate contractUntil;
}