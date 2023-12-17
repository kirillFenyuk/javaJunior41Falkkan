package lesson16;

public class Main1 {
    public static void main(String[] args) {
        Freech freech = new Freech();

        freech.addProduct("яблоко",200);
        freech.addProduct("яблоко",400);
        freech.addProduct("груша",800);
        freech.addProduct("слива",1000);

        System.out.println("--- Перебор продуктов вариант 1 ---");
        freech.printAllProucts();
        System.out.println("--- Перебор продуктов вариант 2 ---");
        freech.printAllProucts2();
        System.out.println("--- Взять один продукт и вывести на консоль ---");
        freech.getProdukt("Груша",300);
        System.out.println("--- Продукт который скоро закончится ---");
        System.out.println(freech.endFirstProdukt());
        System.out.println("--- Вес всех продуктов ---");
        System.out.println(freech.allValueProduks());
        System.out.println("--- Сортировка по имени ---");
        freech.sortedByName();
        System.out.println("--- Сортировка по весу ---");
        freech.sortedByValue();


    }
}
