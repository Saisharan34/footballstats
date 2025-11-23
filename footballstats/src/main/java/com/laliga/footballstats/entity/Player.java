package com.laliga.footballstats.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "players")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String position;
    private int age;
    private String nationality;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;
}