package lesson3;

public class Main1 {
    public static void main(String[] args) {
        // Есть массив чисел нужно напечатать ьлдбкл чётные числа в обратном порядке

        int[] numbers = {3, 5, 9, 4, 2, 7, 9, 6, 4, 6, 1, 3, 7, 8, 4, 6, 5, 3, 4, 4};

        for (int i = numbers.length - 1; i >= 0; i--) {

            if (numbers[i] % 2 == 0) {  // проверка на чётность числа в массиве

                System.out.println(numbers[i]);
            }
        }
    }
}
