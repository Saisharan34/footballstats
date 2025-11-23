package com.laliga.footballstats.service;

import com.laliga.footballstats.entity.Player;
import java.util.List;
import java.util.Optional;

public interface PlayerService {
    Player savePlayer(Player player);
    Optional<Player> getPlayerById(Long id);
    List<Player> getAllPlayers();
    Player updatePlayer(Long id, Player player);
    void deletePlayer(Long id);
    List<Player> getPlayersByTeamId(Long teamId);
}
