package lesson5;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        // Программа будет просить пользователя ввести в консоли фигуру
        // (Треугольник, квадрат, тропеция, круг, овал)
        // Просим ввести пользователя нужные данные о фигуре
        // И на основе введёных данных вывести на консоль площадь и периметр

        System.out.println("Выберите фигуру:");
        System.out.println("1 - Треугольник");
        System.out.println("2 - Квадрат");
        System.out.println("3 - Овал");
        System.out.println("4 - Круг");
        System.out.println("5 - Трапеция");


        // Считывание с клавиотуры
        Scanner scanner = new Scanner(System.in);

        String inputFigyra = scanner.next(); // Принимает символы

        if (inputFigyra.equals("1")||inputFigyra.equalsIgnoreCase("треугольник")){ // Если выбрали треугольник
            System.out.println("Введите сторону а:");
            int a = scanner.nextInt();

            System.out.println("Введите сторону b:");
            int b = scanner.nextInt();

            System.out.println("Введите сторону c:");
            int c = scanner.nextInt();

            System.out.println("Площадь треугольника:");
            MathUtils.squareTriangle(a,b,c);
            System.out.println("Периметр треугольника:"+MathUtils.perimetrTriangle(a,b,c));
        }

        if (inputFigyra.equals("2")||inputFigyra.equalsIgnoreCase("квадрат")){

            System.out.println("Введите сторону квадрата:");
            int a = scanner.nextInt();

            System.out.println("Площадь квалрата:");
            MathUtils.squareKvadpat(a);
            System.out.println("Периметр квадрата:"+MathUtils.perimetrKvadpat(a));
        }

        if (inputFigyra.equals("3")||inputFigyra.equalsIgnoreCase("овал")){ // Если выбрали треугольник
            System.out.println("Введите полуось а:");
            int a = scanner.nextInt();

            System.out.println("Введите полуось b:");
            int b = scanner.nextInt();

            System.out.println("Площадь овала:");
            MathUtils.squareOval(a,b);
            System.out.println(MathUtils.perimetrOval(a,b));
        }

        if (inputFigyra.equals("4")||inputFigyra.equalsIgnoreCase("круг")){

            System.out.println("Введите радиус круга:");
            int a = scanner.nextInt();

            System.out.println("Площадь круга:");
            MathUtils.squareKrug(a);
            System.out.println("Периметр круга:"+MathUtils.perimetrKrug(a));
        }

        if (inputFigyra.equals("5")||inputFigyra.equalsIgnoreCase("трапеция")){ // Если выбрали треугольник
            System.out.println("Введите основание а:");
            int a = scanner.nextInt();

            System.out.println("Введите основание b:");
            int b = scanner.nextInt();

            System.out.println("Введите сторону c:");
            int c = scanner.nextInt();

            System.out.println("Введите сторону d:");
            int d = scanner.nextInt();

            System.out.println("Площадь трапеции:");
            MathUtils.squareTrapecia(a,b,c,d);
            System.out.println("Периметр трапеции:"+MathUtils.perimetrTrapecia(a,b,c,d));
        }






    }
}
