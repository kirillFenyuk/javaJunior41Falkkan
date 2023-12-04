package lesson7;

public class Main {
    public static void main(String[] args) {

        // Инкапсуляция - управление доступом , управление областью видимости
        //




        //Формула создания объекта определённого типа
        // Вызов конструктора (Особый метод который вызываетя после слова new)

        Student vasya = new Student(27, "Вася","Москва","89197564532");
        Student petya = new Student();

        vasya.setAge(27);
        petya.setAge(23);

        System.out.println(vasya.getAge());
        System.out.println(petya.getAge());

    }
}
