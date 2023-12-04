package lesson1;

public class HomeWork {

    public static void main(String[] args) {

        int myCash = 1000;

        int snickersCost = 35;
        int snickersNumber;

        int sweetNumber;
        float sweetCost = 3.5f;

        float change;
        float rest;

        snickersNumber = myCash / snickersCost;

        change = myCash - (snickersNumber * snickersCost);

        sweetNumber = (int) (change / sweetCost);

        rest = change - (sweetNumber * sweetCost);

        System.out.println("Количество сникерсов:" + snickersNumber);
        System.out.println("Количество конфет:" + sweetNumber);
        System.out.println("Сдача:" + rest);
    }
}
