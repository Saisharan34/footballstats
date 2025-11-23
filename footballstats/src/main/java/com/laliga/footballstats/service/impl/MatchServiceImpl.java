package com.laliga.footballstats.service.impl;

import com.laliga.footballstats.entity.Match;
import com.laliga.footballstats.repository.MatchRepository;
import com.laliga.footballstats.service.MatchService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchServiceImpl implements MatchService {

    private final MatchRepository matchRepository;

    public MatchServiceImpl(MatchRepository matchRepository) {
        this.matchRepository = matchRepository;
    }

    @Override
    public Match saveMatch(Match match) {
        return matchRepository.save(match);
    }

    @Override
    public Match getMatchById(Long id) {
        return matchRepository.findById(id).orElse(null);
    }

    @Override
    public List<Match> getAllMatches() {
        return matchRepository.findAll();
    }

    @Override
    public Match updateMatch(Long id, Match updatedMatch) {
        return matchRepository.findById(id).map(match -> {
            match.setHomeTeam(updatedMatch.getHomeTeam());
            match.setAwayTeam(updatedMatch.getAwayTeam());
            match.setMatchDate(updatedMatch.getMatchDate());
            match.setHomeScore(updatedMatch.getHomeScore());
            match.setAwayScore(updatedMatch.getAwayScore());
            return matchRepository.save(match);
        }).orElse(null);
    }

    @Override
    public void deleteMatch(Long id) {
        matchRepository.deleteById(id);
    }
}
