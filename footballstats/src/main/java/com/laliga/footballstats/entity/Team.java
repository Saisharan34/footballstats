package com.laliga.footballstats.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "teams")
@Data
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String stadium;
    private String coachName;

    @OneToMany(mappedBy = "team", cascade = CascadeType.ALL)
    private List<Player> players;
}