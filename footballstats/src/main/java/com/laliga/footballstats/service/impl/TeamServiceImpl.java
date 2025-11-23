package com.laliga.footballstats.service.impl;

import com.laliga.footballstats.config.ApiConfig;
import com.laliga.footballstats.entity.Team;
import com.laliga.footballstats.repository.TeamRepository;
import com.laliga.footballstats.service.TeamService;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class TeamServiceImpl implements TeamService {

    private final TeamRepository teamRepository;
    private final RestTemplate restTemplate;
    private final ApiConfig apiConfig;

    public TeamServiceImpl(TeamRepository teamRepository, RestTemplate restTemplate, ApiConfig apiConfig) {
        this.teamRepository = teamRepository;
        this.restTemplate = restTemplate;
        this.apiConfig = apiConfig;
    }

    @Override
    public Team createTeam(Team team) {
        return teamRepository.save(team);
    }

    @Override
    public Team getTeamById(Long id) {
        Optional<Team> team = teamRepository.findById(id);
        return team.orElse(null); // You can throw a custom exception instead
    }

    @Override
    public List<Team> getAllTeams() {
        return teamRepository.findAll();
    }

    @Override
    public Team updateTeam(Long id, Team updatedTeam) {
        return teamRepository.findById(id)
                .map(existingTeam -> {
                    existingTeam.setName(updatedTeam.getName());
                    existingTeam.setStadium(updatedTeam.getStadium());
                    existingTeam.setCoachName(updatedTeam.getCoachName());
                    return teamRepository.save(existingTeam);
                })
                .orElse(null);
    }

    @Override
    public void deleteTeam(Long id) {
        teamRepository.deleteById(id);
    }

    /**
     * Fetch team details from external Football API and save into DB
     */
    public Team fetchAndSaveTeamFromApi(Long teamId) {
        String url = apiConfig.getBaseUrl() + "/teams/" + teamId;

        HttpHeaders headers = new HttpHeaders();
        headers.set("X-Auth-Token", apiConfig.getApiKey());
        HttpEntity<String> entity = new HttpEntity<>(headers);

        ResponseEntity<Map> response = restTemplate.exchange(url, HttpMethod.GET, entity, Map.class);

        if (response.getStatusCode() == HttpStatus.OK && response.getBody() != null) {
            Map<String, Object> body = response.getBody();

            Team team = new Team();
            team.setName((String) body.get("name"));
            team.setStadium((String) body.get("venue")); // depends on API field
            team.setCoachName(body.containsKey("coach") ? ((Map<String, String>) body.get("coach")).get("name") : null);

            return teamRepository.save(team);
        }

        return null;
    }
}
