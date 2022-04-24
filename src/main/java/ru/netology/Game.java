package ru.netology;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Game {
    public List<Player> players = new ArrayList<>();

    public void registered(Player player) {
        this.players.add(player);
    }

    public int round(String playerName1, String playerName2) {
        Player firstPlayer = find(playerName1);
        Player secondPlayer = find(playerName2);
        if (firstPlayer == null || secondPlayer == null) {
            throw new NotRegisteredException();
        }
        int result = firstPlayer.getStrength() - secondPlayer.getStrength();
        if (result > 0) {
            return 1;
        }
        if (result < 0) {
            return 2;
        }
        return 0;
    }

    private Player find(String name) {
        for (Player player : players) {
            if (player.getName() == name) {
                return player;
            }
        }
        return null;
    }
}