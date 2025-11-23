package com.laliga.footballstats.service;

import com.laliga.footballstats.entity.MatchEvent;
import java.util.List;
import java.util.Optional;

public interface MatchEventService {
    MatchEvent saveMatchEvent(MatchEvent matchEvent);
    Optional<MatchEvent> getMatchEventById(Long id);
    List<MatchEvent> getAllMatchEvents();
    void deleteMatchEvent(Long id);
}
