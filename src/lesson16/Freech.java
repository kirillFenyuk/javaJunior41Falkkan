package lesson16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    public void getProdukt(String nameOfProduct, int value) {

        nameOfProduct = nameOfProduct.toLowerCase();

        if (products.containsKey(nameOfProduct)) {
            int currentValue = products.get(nameOfProduct);

            if (currentValue > value) {
                products.put(nameOfProduct, currentValue - value);
                System.out.println(nameOfProduct + " осталось: " + (currentValue - value));
            } else {
                System.out.println("В холодильнике оставалось: " + currentValue);
                System.out.println("Вы забрали остаток.");
                products.remove(nameOfProduct);
            }
        } else {
            System.out.println("Такого продукта нет!");
        }
    }

    // 2 вывести на терминал какой продут закончится самым первым
    public String endFirstProdukt() {
        String nameProduktEnd = null;
        int count = Integer.MAX_VALUE;

        for (Map.Entry<String, Integer> food : products.entrySet()) {
            String nameFoodEnd = food.getKey();
            int valueFoodEnd = food.getValue();

            if (valueFoodEnd < count) {
                count = valueFoodEnd;
                nameProduktEnd = nameFoodEnd;
            }
        }
        return nameProduktEnd + " cкоро закончится";
    }

    // 3 вывести всех продуктов в холодильнике
    public int allValueProduks() {

        int allValue = 0;

        for (int value : products.values()) {
            allValue += value;
        }

        return allValue;
    }

    // 4 - вывести продукты и вес в отсортированном формате по Названию
    public void sortedByName() {
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(products.entrySet());
        entryList.sort((entry2, entry1) -> entry2.getKey().compareTo(entry1.getKey()));
        System.out.println("Сортировка по Названию: " + entryList);
    }

    // 5 - *** вывести продукты и вес в отсортированном формате по ВЕСУ(от большего к меньшему)
    public void sortedByValue() {
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(products.entrySet());
        entryList.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        System.out.println("Сортировка по по Весу: " + entryList);

    }
}
