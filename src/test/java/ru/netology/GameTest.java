package ru.netology;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    private Game game = new Game();

    Player first = new Player(1, "Petya", 1);
    Player second = new Player(2, "Vasya", 2);
    Player third = new Player(3, "Vanya", 3);
    Player fourth = new Player(4, "Stepa", 4);
    Player fifth = new Player(5, "Alesha", 4);

    @BeforeEach
    public void preAdd() {
        game.registered(first);
        game.registered(second);
        game.registered(third);
        game.registered(fourth);
    }

    @Test
    public void registered() {

        Player[] expected = new Player[]{first, second, third, fourth};
        Player[] actual = game.players.toArray(new Player[0]);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void roundWinnerFirst() {
        int expected = 1;
        int actual = game.round("Vasya", "Petya");
        assertEquals(expected, actual);
    }

    @Test
    public void roundWinnerSecond() {
        int expected = 2;
        int actual = game.round("Vanya", "Stepa");
        assertEquals(expected, actual);
    }

    @Test
    public void roundDraw() {
        game.registered(fifth);
        int expected = 0;
        int actual = game.round("Stepa", "Alesha");
        assertEquals(expected, actual);
    }

    @Test
    public void roundFirstNoRegistered() {
        assertThrows(NotRegisteredException.class, () -> {
            game.round("Alesha", "Stepa");
        });
    }

    @Test
    public void roundSecondNoRegistered() {
        assertThrows(NotRegisteredException.class, () -> {
            game.round("Stepa", "Alesha");
        });
    }
}