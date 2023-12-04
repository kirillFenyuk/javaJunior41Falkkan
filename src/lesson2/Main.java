package lesson2;

public class Main {

    public static void main(String[] args) {

        int money = 1000;
        int costOfSnickers = 35;
        double costOfCandy = 3.5;

        int countCanSnikBy = money / costOfSnickers; // 28 сникерсов

        int rest = money % costOfSnickers; // 20 руб. сдача

        // 2 вида преобразования
        // внизсходящие происходит автоматически
        // вверсходящее ручное преобразование
        int countCanCandyBy = (int) (rest / costOfCandy);

        double totalRest = rest - (countCanCandyBy * costOfCandy);

        System.out.println(countCanSnikBy);
        System.out.println(countCanCandyBy);
        System.out.println(totalRest);

    }
}
