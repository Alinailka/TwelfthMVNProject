package ru.netology;

import java.util.Arrays;

public class Game {

    Player[] players = new Player[0];

    public void register(Player player) {
        int length = players.length + 1;
        Player[] tmp = new Player[length];
        System.arraycopy(players, 0, tmp, 0, players.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = player; //положить в ячейку предмет с принятым id
        players = tmp;
    }
    //метод регистрации игрока; если игрок не зарегистрирован,
    // то он не сможет играть в турнире.
    // Вам нужно хранить всех зарегистрированных игроков в поле класса Game в виде списка.

//

    public boolean matches(Product product, String search) {
        if (product.getName().contains(search)) {
            return true;
        } else {
            return false;
        }
        // или в одну строку:
        // return product.getName().contains(search);
    }






    public Player[] round(String playerName1, String playerName2) {
        Player[] participants = new Player[2];
        for (Player player : players) {
            if (player.getName() == playerName1) {

//                int length = participants.length;
//                Player[] tmp = new Player[length];
                System.arraycopy(players, 0, participants, 0, participants.length);
//                int lastIndex = participants.length - 1;
//                tmp[lastIndex] = player;
            //    participants = tmp;
            }
            if (player.getName() != playerName1) {
                throw new NotRegisteredException(playerName1);
            }

          if (player.getName() == playerName2) {
  System.arraycopy(players, 0, participants, 1, participants.length);}
            if (player.getName() != playerName2) {
                throw new NotRegisteredException(playerName1);
            }

//                int length = participants.length + 1;
//                Player[] tmp = new Player[length];
//                System.arraycopy(participants, 0, tmp, 0, participants.length);
//                int lastIndex = tmp.length - 1;
//                tmp[lastIndex] = player;
//                participants = tmp;
//                if (player.getName() != playerName2) {
//                    throw new NotRegisteredException(playerName1);
//                }
//            }
//        }

     //   Arrays.sort(participants);
        //todo сравнение у кого больше сила


    }
        return participants;}
    //метод соревнования между двумя игроками.
    // Если хотя бы один из игроков незарегистрирован,
    // должно выкинуться исключение NotRegisteredException
    // (сами создайте его класс). Обратите внимание,
    // что игроки передаются методу через имя -
    // полную информацию об игроке нужно будет найти в коллекции зарегистрированных игроков
    // (см. аналог в виде findById из прошлых дз).
    // Выигрывает тот игрок, у которого больше strength (сила);
    // если сила одинаковая, то будет ничья.
    // Метод должен возвращать одно число - 0 в случае ничьи,
    // 1 в случае победы первого игрока и 2 в случае победы второго игрока.
}
