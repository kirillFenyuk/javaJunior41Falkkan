package lesson2;

public class HomeWork3 {
    public static void main(String[] args) {

        int startMoney = 9500;
        double month = 0;
        double year = 0;
        int target = 200000;

        for (int countMoney = 0; countMoney <= 1000000; countMoney = startMoney + countMoney) {

            month++;

            if (countMoney >= target) {

                year = month / 12;

                System.out.println(" Столько потребуется " + year + " лет на накопление нужной суммы: 200.000 ");

                break;
            }
        }
    }
}