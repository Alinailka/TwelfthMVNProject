package ru.netology;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    Game game = new Game();
    Player [] players = new Player[0];

    Player first = new Player (1, "Petya",1 );
    Player second = new Player (2, "Vasya",2 );
    Player third = new Player (3, "Vanya",3 );
    Player fourth = new Player (4, "Stepa",4 );
    Player fifth = new Player (5, "Alesha",5 );



    @Test
    void register() {
        game.register(first);
        game.register(second);
        game.register(third);
        game.register(fourth);
        Player [] expected = new Player[]{first, second, third, fourth};
        Player [] actual = game.players;
        assertArrayEquals(expected, actual);
    }

    @Test
    void round() {
        game.register(first);
        game.register(second);
        game.round("Petya", "Vasya");
        Player [] expected = new Player[]{first, second};
        Player [] actual = game.round("Petya", "Vasya");
        assertArrayEquals(expected, actual);
    }
    @Test
    void roundIfPlayerNoRegistered() {
        game.register(fourth);
        assertThrows(NotRegisteredException.class, () -> {
            game.round("Stepa", "Alesha");
        });
    }
    @Test
    void sortByStrength() {
        game.register(first);
        game.register(second);
        Player[] expected = new Player[]{second,first,};
        Player[] actual = new Player[]{second,first};

        Arrays.sort(actual);
      assertArrayEquals(expected, actual);
    }
}