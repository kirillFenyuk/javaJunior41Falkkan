package lesson5;

public class MathUtils {

    /**
     * Создание метода:
     * 1 - Модификатор доступа (свлово определяющее область видимости)
     * <p>
     * 1 - public  - Доступен внутри всего проэкта
     * 2 - protected - Доступен только внутри текущей папки и наследникам текущего класса
     * 3 --- _______(ничего)  - Доступен только в этой папке (текущей)
     * 4 - private  -   Виден только внутри этого класса
     * <p>
     * <p>
     * Где можно ставить модификатор доступа:
     * <p>
     * перед классом
     * перед методом (там где создаётся метод)
     * <p>
     * <p>
     * 2 - static (Пишем или нет)
     * <p>
     * 3 - возвращаемый тип (или слово void если оно отсутствует)
     * <p>
     * 4 - название метода (максимально корректно)
     * <p>
     * 5 - входящие параметры (то без чего не возможно выполнить данный метод)
     * Всегда записываются в () через запятую и указывая тип и название переменной
     * <p>
     * 6 - тело выполнения данной команды (метода)
     */

    // Создать метот который посчитает прощадь по 3 сторонам
    // И вывести её на консоль
    public static void squareTriangle(int a, int b, int c) {

        double p = (a + b + c) / 2.0;

        System.out.println(Math.sqrt(p * (p - a) * (p - b) * (p - c)));
    }


    // Метод возвращает  периметр треугольника

    public static int perimetrTriangle(int a, int b, int c) {
        return a + b + c;
    }

    //Метод который выведет на консоль площадь квадрата

    public static void squareKvadpat(int a) {

        int square = a * a;

        System.out.println(square);
    }

    //Метод возвращает периметр квадрата

    public static int perimetrKvadpat(int a) {
        return a * 4;
    }

    //Метод который выведет на консоль площадь овала(элипса)

    public static void squareOval(int a, int b) {

        double square = Math.PI * a * b;

        System.out.println(square);
    }

    //Метод возвращает периметр овала(элипса)

    public static double perimetrOval(int a, int b) {

        double p = (2 * Math.PI) * Math.sqrt(((a * a) + (b * b)) / 2);

        return p;
    }

    //Площадь круга

    public static void squareKrug(int a) {

        double s = Math.PI * (a * a);

        System.out.println(s);
    }

    //Периметр круга

    public static double perimetrKrug(int a) {

        double p = 2 * Math.PI * a;

        return p;
    }

    //Площадь трапеции

    public static void squareTrapecia(int a, int b, int c, int d) {

        double p = (a + b + c + d) / 2;

        double s = ((a + b) / Math.abs(a - b)) * Math.sqrt((p - a) * (p - b) * (p - a - c) * (p - a - d));

        System.out.println(s);
    }

    //Периметр трапеции

    public static int perimetrTrapecia(int a, int b, int c, int d) {
        return a + b + c + d;
    }


}
