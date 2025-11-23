package com.laliga.footballstats.service.impl;

import com.laliga.footballstats.entity.MatchEvent;
import com.laliga.footballstats.repository.MatchEventRepository;
import com.laliga.footballstats.service.MatchEventService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MatchEventServiceImpl implements MatchEventService {

    private final MatchEventRepository matchEventRepository;

    public MatchEventServiceImpl(MatchEventRepository matchEventRepository) {
        this.matchEventRepository = matchEventRepository;
    }

    @Override
    public MatchEvent saveMatchEvent(MatchEvent matchEvent) {
        return matchEventRepository.save(matchEvent);
    }

    @Override
    public Optional<MatchEvent> getMatchEventById(Long id) {
        return matchEventRepository.findById(id);
    }

    @Override
    public List<MatchEvent> getAllMatchEvents() {
        return matchEventRepository.findAll();
    }

    @Override
    public void deleteMatchEvent(Long id) {
        matchEventRepository.deleteById(id);
    }
}
