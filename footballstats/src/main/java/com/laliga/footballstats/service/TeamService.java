package com.laliga.footballstats.service;

import com.laliga.footballstats.entity.Team;

import java.util.List;

public interface TeamService {
    Team createTeam(Team team);
    Team getTeamById(Long id);
    List<Team> getAllTeams();
    Team updateTeam(Long id, Team updatedTeam);
    void deleteTeam(Long id);
}
