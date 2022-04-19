package ru.netology;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Game {
    public Collection<Player> players = new ArrayList<>();
    public boolean registered(Player player) {
        return players.add(player);
    }

    public int round(String playerName1, String playerName2) {
        for (Player player : players) {
            if (contains(player, playerName1)) {
                if (contains(player, playerName2)) {
                    int result = player.compareTo(player);
                    return result;
                }
                if (!contains(player, playerName2)) {
                    throw new NotRegisteredException(playerName2);
                }
            }
            if (!contains(player, playerName1)) {
                throw new NotRegisteredException(playerName2);
            }
        }
    return 0;}

    public boolean contains(Player player, String search) {
        return player.getName().contains(search);
    }
}
