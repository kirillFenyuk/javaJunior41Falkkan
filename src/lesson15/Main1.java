package lesson15;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class Main1 {
    public static void main(String[] args) {
        Coin coin1 = new Coin(5, 1999, "Gold", 2.5);
        Coin coin2 = new Coin(5, 1999, "Gold", 2.5);
        Coin coin3 = new Coin(10, 1990, "Olovo", 2.8);
        Coin coin4 = new Coin(20, 1998, "Silver", 3.5);
        Coin coin5 = new Coin(30, 1997, "Cupper", 4.5);


        TreeSet<Coin> coins = new TreeSet<>();

        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);
        coins.add(coin5);

        System.out.println("--- Сортировка по номиналу ---");
        for (Coin c : coins) {
            System.out.println(c);
        }

        System.out.println("--- Сортировка по году ---");
        TreeSet<Coin> sortingByYear = new TreeSet<>(new SortByYearComparator());
        sortingByYear.addAll(coins);

        for (Coin c : sortingByYear) {
            System.out.println(c);
        }

        System.out.println("--- Сортировка в обратном порядке ---");
        TreeSet<Coin> reverse = new TreeSet<>(new Comparator<Coin>() {
            @Override
            public int compare(Coin o1, Coin o2) {
                if (o1.getYear() != o2.getYear()) {
                    return o2.getYear() - o1.getYear();
                }

                if (!o1.getMetall().equals(o2.getMetall())) {
                    return o2.getMetall().compareTo(o1.getMetall());
                }

                if (o1.getNominal() != o2.getNominal()) {
                    return o2.getNominal() - o1.getNominal(); // 5 - 10 = -5
                }

                return Double.compare(o2.getDiametr(), o1.getDiametr());
            }
        });

        reverse.addAll(coins);

        for (Coin c : reverse) {
            System.out.println(c);
        }
    }
}
