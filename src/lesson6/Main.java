package lesson6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[][] tours = new String[100][8];
        ToursUtils.addTour("Италия", "Рим", "Самолет",
                "6 дней", "140000 руб", "3 звезды", "Завтрак", tours);
        ToursUtils.addTour("Италия", "Рим", "Самолет",
                "6 дней", "100000 руб", "2 звезды", "Завтрак", tours);
        ToursUtils.addTour("Италия", "Рим", "Самолет",
                "4 дней", "150000 руб", "4 звезды", "Завтрак + ужин", tours);
        ToursUtils.addTour("Италия", "Флоренция", "Автобус",
                "5 дней", "130000 руб", "3 звезды", "Завтрак + ужин", tours);
        ToursUtils.addTour("Италия", "Флоренция", "Самолет",
                "4 дня", "40000 руб", "2 звезды", "Завтрак + ужин", tours);
        ToursUtils.addTour("Франция", "Париж", "Самолет",
                "8 дней", "240000 руб", "5 звезд", "Завтрак", tours);
        ToursUtils.addTour("Италия", "Рим", "Самолет",
                "6 дней", "180000 руб", "3 звезды", "Завтрак", tours);
        ToursUtils.addTour("Италия", "Рим", "Автобус",
                "3 дня", "80000 руб", "4 звезды", "Завтрак + Ужин", tours);
        ToursUtils.addTour("Германия", "Мюнхен", "Самолет",
                "6 дней", "220000 руб", "4 звезды", "Завтрак", tours);
        ToursUtils.addTour("Италия", "Рим", "Автобус",
                "9 дней", "340000 руб", "5 звезд", "Завтрак", tours);
        ToursUtils.addTour("Германия", "Берлин", "Самолет",
                "8 дней", "380000 руб", "5 звезд", "Все включено", tours);

        System.out.println("По какому критерию вы хотите выбрать тур?:");
        System.out.println("1 - по стране");
        System.out.println("2 - по бюджету");
        System.out.println("3 - по продолжительности");
        System.out.println("4 - по звёздам и транспорту");
        System.out.println("5 - по стране и бюджету");


        //считаем с клавиатуры индекс для выбора метода поиска

        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();


        if (index == 1) ScannerUtils.searchByCountry(tours);
        else if (index == 2) ScannerUtils.searchByBudget(tours);
        else if (index == 3) ScannerUtils.searchByDay(tours);
        else if (index == 4) ScannerUtils.searchByStarsAndTransport(tours);
        else if (index == 5) ScannerUtils.searchByCountryAndBudget(tours);
        else System.out.println("Такого варианта нет");




        /* 1 - Вывести на консоль туры, которые на столько то ... дней
         * 2 - Вывести на коносль туры на ... звезд и ... транспортом
         * 3 - Вывести туры на консоль ... страны и на ... бюджет
         */
    }
}
