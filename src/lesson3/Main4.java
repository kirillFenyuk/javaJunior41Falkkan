package lesson3;

public class Main4 {
    public static void main(String[] args) {

        // Есть массив чисел, гапечатать на консоль
        // соседа справа, если ячейка кратная 3

        int[] numbers = {1, 67, 3, 578, 645, 345, 445, 6767, 4534, 4455, 454, 4, 6, 8, 4, 3, 56, 66, 42};

        for (int i = 0; i < numbers.length; i++) {

            if (i != numbers.length - 1) { // Когда есть сосед справа

                if (numbers[i] % 3 == 0) { // Проверка на кратность 3

                    System.out.println(numbers[i + 1]);
                }
            }
        }
    }
}
