package lesson2;

public class HomeWork4 {
    public static void main(String[] args) {

        for (int i = 20; i <= 60; i++) {

            int chetnieChisla = i % 2;

            if (i >= 30 && i <= 40) {

                continue;

            } else if (chetnieChisla == 0) {

                System.out.println(i);
            }
        }
    }
}
