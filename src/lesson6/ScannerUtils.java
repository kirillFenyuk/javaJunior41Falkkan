package lesson6;

import java.util.Scanner;

public class ScannerUtils {


    public static void searchByCountry(String[][] tours) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("В какую страну хотите поехать");
        String country = scanner.next();
        System.out.println("--------РЕЗУЛЬТАТ-------");
        ToursUtils.printToursByCountry(tours, country);
        System.out.println("------------------------");
    }

    //поиск туров по продолжительности
    public static void searchByDay(String[][] tours) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какой продолжительность в днях?");
        String day = scanner.nextLine();
        System.out.println("--------РЕЗУЛЬТАТ-------");
        ToursUtils.printToursByDay(tours, day);
        System.out.println("------------------------");
    }

    //поиск туров по бюджету, задается одно число и мы печатаем туры  + - 200000 от этого бюджета
    public static void searchByBudget(String[][] tours) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какой бюджет?");
        int budget = scanner.nextInt();
        System.out.println("--------РЕЗУЛЬТАТ-------");
        ToursUtils.printToursByBudget(tours, budget);
        System.out.println("------------------------");
    }

    //поиск туров по кол-ву звезд и типу транспорта
    public static void searchByStarsAndTransport(String[][] tours) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("отель с каким кол-вом звезд Вас интересует?");
        String stars = scanner.nextLine();//забираем всю строку
        System.out.println("какой вид транспорта Вас интересует?");
        String transport = scanner.nextLine();
        System.out.println("--------РЕЗУЛЬТАТ-------");
        ToursUtils.printToursStarsAndTransport(tours, stars, transport);
        System.out.println("------------------------");
    }

    //поиск туров по стране и бюджету
    public static void searchByCountryAndBudget(String[][] tours) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("В какую страну хотите поехать");
        String country = scanner.next();
        System.out.println("Какой бюджет?");
        int budget = scanner.nextInt();
        System.out.println("--------РЕЗУЛЬТАТ-------");
        ToursUtils.printToursByCountryAndBudget(tours, country, budget);
        System.out.println("------------------------");
    }
}
