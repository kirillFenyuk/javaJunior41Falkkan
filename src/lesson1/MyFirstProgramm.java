package lesson1; // package - Указание в какой папке находится текущий файл

// public - общедоступный (открытый)
// class - кусочек java-кода, который с одной смысловой нагрузкой
// psvm - точка старта

public class MyFirstProgramm {

    // точка начала программы. Код внутри будет отработан


    public static void main(String[] args) {
        // Форматирование кода: ctrl + Alt + L
        int a = 3;
        int b = 4;
        int c = 5;

        int perimetrOfTriangle = a + b + c;

        // sout - вывод на консоль кода
        System.out.println(perimetrOfTriangle);


    }

}
