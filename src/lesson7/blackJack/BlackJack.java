package lesson7.blackJack;

import java.util.ArrayList;

public class BlackJack {

    private Koloda koloda = new Koloda();
    private ArrayList<Player> players = new ArrayList<>();

    public BlackJack() {
        koloda.prepared();
    }

    public void addPlayerToGame(Player player) {
        players.add(player);
    }

    public void dealToCardsToAllPlayers() {
        for (Player player : players) {  //Прошлись по всем игрокам и крупье
            player.addCardToHand(koloda.randomCard()); // Дали первую карту
            player.addCardToHand(koloda.randomCard()); // Дали вторую карту
        }
    }

    public void dealRestCardsToAllPlayers() {
        for (Player player : players) {
            while (player.doYouNeedMoreCards()) {
                player.addCardToHand(koloda.randomCard()); // Дали карту на сохранение
            }
        }
    }

    public void printWinner() {
        /*/
        13 13 22 12 10 ----- выиграли 13 13
        22 22 23 24 23 ----- выиграл крупье
        21 21 21 24 26 ----- выиграли 21 21 21
        20 20 20 20 20 ----- выиграли все
        20 19 18 15 22 ----- выиграл 20
         */

        // Ставим флажок False всем у кого перебор
        for (Player p : players) {
            if (p.countValueInHand() > 21) {
                p.setCanWin(false);
            }
        }

        if (countPlayersWhoCanWin() == 0) { // Находим крупье и печатаем его
            for (Player p : players) {
                if (p instanceof Dealer) {
                    System.out.println("Выиграл: " + p.getName());
                    p.openHand();
                    return; // Выходим из метода, дальше проверки не нужны
                }
            }
        }

        int winnerValue = 1;
        for (Player p : players) { // Ищем максимальный балл к 21 и игрок дожен быть в игре
            if (p.isCanWin() && p.countValueInHand() > winnerValue) {
                winnerValue = p.countValueInHand();
            }
        }

        for (Player p : players) {
            if (p.countValueInHand() == winnerValue) { //Если у игрока балл победителя
                System.out.println("Выиграл: " + p.getName());
                p.openHand();
            }
        }

    }

    public int countPlayersWhoCanWin() {
        int count = 0;
        for (Player p : players) {
            if (p.isCanWin()) {
                count++;
            }
        }
        return count;
    }
}
