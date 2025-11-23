package com.laliga.footballstats.service.impl;

import com.laliga.footballstats.entity.Player;
import com.laliga.footballstats.repository.PlayerRepository;
import com.laliga.footballstats.service.PlayerService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerServiceImpl implements PlayerService {

    private final PlayerRepository playerRepository;

    public PlayerServiceImpl(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    @Override
    public Player savePlayer(Player player) {
        return playerRepository.save(player);
    }

    @Override
    public Optional<Player> getPlayerById(Long id) {
        return playerRepository.findById(id);
    }

    @Override
    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

    @Override
    public Player updatePlayer(Long id, Player player) {
        return playerRepository.findById(id).map(existingPlayer -> {
            existingPlayer.setName(player.getName());
            existingPlayer.setPosition(player.getPosition());
            existingPlayer.setAge(player.getAge());
            existingPlayer.setTeam(player.getTeam());
            return playerRepository.save(existingPlayer);
        }).orElseThrow(() -> new RuntimeException("Player not found with id " + id));
    }

    @Override
    public void deletePlayer(Long id) {
        playerRepository.deleteById(id);
    }

    @Override
    public List<Player> getPlayersByTeamId(Long teamId) {
        return playerRepository.findByTeamId(teamId);
    }
}
