package lesson15;

import java.util.HashSet;
import java.util.TreeSet;

public class Main1 {
    public static void main(String[] args) {
        Coin coin1 = new Coin(5,1999,"Gold",2.5);
        Coin coin2 = new Coin(5,1999,"Gold",2.5);
        Coin coin3 = new Coin(10,1990,"Olovo",2.8);
        Coin coin4 = new Coin(20,1998,"Silver",3.5);
        Coin coin5 = new Coin(30,1997,"Cupper",4.5);


        TreeSet<Coin> coins =new TreeSet<>();

        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);
        coins.add(coin5);

        for(Coin c:coins){
            System.out.println(c);
        }
    }
}
