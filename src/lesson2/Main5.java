package lesson2;

public class Main5 {
    public static void main(String[] args) {
        // Напечатать числа от 30 до 3000, кратные 3 и 6 и 15

        for (int i = 30; i <= 3000; i++) {

            if (i % 3 == 0 && i % 6 == 0 && i % 15 == 0) {
                System.out.println(i);

            }
        }
    }
}
