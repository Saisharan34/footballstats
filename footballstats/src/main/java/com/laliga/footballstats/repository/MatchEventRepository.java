package com.laliga.footballstats.repository;

import com.laliga.footballstats.entity.MatchEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MatchEventRepository extends JpaRepository<MatchEvent, Long> {
    List<MatchEvent> findByMatchId(Long matchId);
    List<MatchEvent> findByPlayerId(Long playerId);
    List<MatchEvent> findByEventType(String eventType);
}
