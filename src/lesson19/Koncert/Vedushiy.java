package lesson19.Koncert;

public class Vedushiy {
    public static void main(String[] args) {

        System.out.println("Начало концерта: ");

        Pevec1 pevec1 = new Pevec1();
        pevec1.setName("  Госля");
        pevec1.start();

        Pevec2 pevec2 = new Pevec2();
        pevec2.setName("  Эмма");
        pevec2.setDaemon(true);
        pevec2.start();

        while (pevec1.isAlive()){

        }


        System.out.println("Конец концерта");
    }
}
