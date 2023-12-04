package lesson8.HomeWorkFiguri;

import lesson5.MathUtils;

import java.util.Scanner;

public class SkannerUtil {

    Scanner scanner=new Scanner(System.in);

    public void viborFiguri(){

        String inputFigyra = scanner.next(); // Принимает символы

        if (inputFigyra.equals("1")||inputFigyra.equalsIgnoreCase("треугольник")){ // Если выбрали треугольник
            System.out.println("Введите сторону а:");
            int a = scanner.nextInt();

            System.out.println("Введите сторону b:");
            int b = scanner.nextInt();

            System.out.println("Введите сторону c:");
            int c = scanner.nextInt();

            System.out.println("Площадь треугольника: "+Treugolnik.squareTriangle(a,b,c));
            System.out.println("------------------------------------------------");
            System.out.println("Периметр треугольника: "+Treugolnik.perimetrTriangle(a,b,c));
        }

        if (inputFigyra.equals("2")||inputFigyra.equalsIgnoreCase("прямоугольник")){

            System.out.println("Введите сторону a:");
            int a = scanner.nextInt();

            System.out.println("Введите сторону b:");
            int b = scanner.nextInt();

            System.out.println("Площадь прямоугольника: "+Priamougolnik.ploshadPriamougolnika(a,b));
            System.out.println("------------------------------------------------");
            System.out.println("Периметр прямоугольника: "+Priamougolnik.perimetrPriamougolnika(a,b));

        }

        if (inputFigyra.equals("3")||inputFigyra.equalsIgnoreCase("квадрат")){ // Если выбрали треугольник

            System.out.println("Введите сторону квадрата:");
            int a = scanner.nextInt();

            System.out.println("Площадь квадрата: "+Kvadrat.ploshKvadrata(a));
            System.out.println("------------------------------------------------");
            System.out.println("Периметр квадрата: "+Kvadrat.perKvadrata(a));

        }

        if (inputFigyra.equals("4")||inputFigyra.equalsIgnoreCase("круг")){

            System.out.println("Введите радиус круга:");
            int a = scanner.nextInt();

            System.out.println("Площадь круга: "+Krug.ploshKruga(a));
            System.out.println("------------------------------------------------");
            System.out.println("Периметр круга: "+Krug.perKruga(a));


        }

        if (inputFigyra.equals("5")||inputFigyra.equalsIgnoreCase("овал")){ // Если выбрали треугольник

            System.out.println("Введите полуось а:");
            int a = scanner.nextInt();

            System.out.println("Введите полуось b:");
            int b = scanner.nextInt();

            System.out.println("Площадь овала: "+Oval.ploshOvala(a,b));
            System.out.println("------------------------------------------------");
            System.out.println("Периметр овала: "+Oval.perOvala(a,b));

        }
    }
}
