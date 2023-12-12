package lesson16;

import java.util.HashMap;
import java.util.Map;

public class Freech {
    private HashMap<String, Integer> products = new HashMap<>();

    public void addProduct(String nameOfProduct, int value) {

        if (products.containsKey(nameOfProduct)) {
            int currentValue = products.get(nameOfProduct);
            products.put(nameOfProduct, value + currentValue);
        } else { // Если такого продукта нет в холодильнике
            products.put(nameOfProduct, value);
        }
    }

    public void printAllProucts() {
        // проход по Map
        for (Map.Entry<String, Integer> pr : products.entrySet()) {
            System.out.println(pr.getKey() + " - " + pr.getValue());
        }
    }

    public void printAllProucts2() {
        // 2ой способ прохода по Map
        for (String prName : products.keySet()) {
            System.out.println(prName + " - " + products.get(prName));
        }
    }

    // 1 взять продукт с холодильника
    // 2 вывести на терминал какой продут закончится самым первым
    // 3 вывести всех продуктов в холодильнике

    // 4 вывести продукты и вес в остсортировонном формате по названию
    // 5 вывести продуты и вес в остсортировонном формате по весу

}
