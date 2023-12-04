package lesson8.HomeWorkFiguri;

public class Main {
    public static void main(String[] args) {

        SkannerUtil skannerUtil = new SkannerUtil();

        System.out.println("Выберите фигуру:");
        System.out.println("1 - Треугольник");
        System.out.println("2 - Прямоугольник");
        System.out.println("3 - Квадрат");
        System.out.println("4 - Круг");
        System.out.println("5 - Овал");

        skannerUtil.viborFiguri();
    }

}
