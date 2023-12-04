package lesson7.blackJack;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        Dealer dealer = new Dealer();

        player1.setName("Vasya");
        player2.setName("Petya");
        player3.setName("Kolya");
        dealer.setName("Dealer");

        BlackJack blackJack = new BlackJack(); // Уже сорздана колода и подготовлена

        blackJack.addPlayerToGame(player1);
        blackJack.addPlayerToGame(player2);
        blackJack.addPlayerToGame(player3);
        blackJack.addPlayerToGame(dealer);

        blackJack.dealToCardsToAllPlayers();

        blackJack.dealRestCardsToAllPlayers();

        blackJack.printWinner();

    }
}
