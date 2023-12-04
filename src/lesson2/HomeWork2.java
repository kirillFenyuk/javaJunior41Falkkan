package lesson2;

public class HomeWork2 {
    public static void main(String[] args) {

        int nomber = 0;

        for (int i = 30; i < 61; i++) {

            int count = i % 2;

            if (count == 0) {

                nomber++;
            }

        }

        System.out.println("Количество чётных чисел в диапазоне от 30 до 61 равняетя:" + nomber);
    }
}
