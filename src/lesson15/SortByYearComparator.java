package lesson15;

import java.util.Comparator;

public class SortByYearComparator implements Comparator<Coin> {
    @Override
    public int compare(Coin o1, Coin o2) {

        // this --- o1
        // o --- o2

        if (o1.getYear() != o2.getYear()) {
            return o1.getYear() - o2.getYear();
        }

        if (!o1.getMetall().equals(o2.getMetall())) {
            return o1.getMetall().compareTo(o2.getMetall());
        }

        if (o1.getNominal() != o2.getNominal()) {
            return o1.getNominal() - o2.getNominal(); // 5 - 10 = -5
        }

        return Double.compare(o1.getDiametr(), o2.getDiametr());
    }
}
