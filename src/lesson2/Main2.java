package lesson2;

public class Main2 {
    public static void main(String[] args) {
        // Есть 3 стороны треугольника, и нужно вывести равносторонний или разносторонний

        // Управляющая конструкция if else

        int a = 7;
        int b = 9;
        int c = 5;


        if (a == b && b == c && c == a) {
            System.out.println("Это равносторонний треугольник");
        } else if (a != b && b != c && c != a) {
            System.out.println("Это разносторонний треугольник");
        } else {
            System.out.println("Это равнобедренный треугольник");
        }

    }
}
