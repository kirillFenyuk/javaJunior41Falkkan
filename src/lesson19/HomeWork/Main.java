package lesson19.HomeWork;

public class Main {
    static int count=0;
    public static void main(String[] args) {

        System.out.println("----Начинается отсчёт----");

        Vasya vasya = new Vasya();
        vasya.setName("Вася: ");
        vasya.start();

        Petruha petruha = new Petruha();
        petruha.setName("Петруха: ");
        petruha.setDaemon(true);
        petruha.start();

        while (vasya.isAlive() & petruha.isAlive()) {

        }


        System.out.println("----Отсчёт завершён----");
    }
}
