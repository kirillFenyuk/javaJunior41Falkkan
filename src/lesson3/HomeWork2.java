package lesson3;

public class HomeWork2 {
    public static void main(String[] args) {

        int[] numbers = {3, 5, 8, 3, 55, 4, 1, 65, 36, 98};

        for (int i = 0; i < numbers.length; i++) {

            // Преобразовать число в ряд символов
            // Канкатинация строк = склеивание текста (объединение текста)

            String currentNumFromMassive = numbers[i] + ""; // 3 --> "3"

            if (currentNumFromMassive.contains("5")){  // contains = содержит

                System.out.println(currentNumFromMassive);
            }


        }
    }
}
