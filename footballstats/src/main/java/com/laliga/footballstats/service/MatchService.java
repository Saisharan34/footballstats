package com.laliga.footballstats.service;

import com.laliga.footballstats.entity.Match;

import java.util.List;

public interface MatchService {
    Match saveMatch(Match match);

    Match getMatchById(Long id);

    List<Match> getAllMatches();

    Match updateMatch(Long id, Match match);

    void deleteMatch(Long id);
}
