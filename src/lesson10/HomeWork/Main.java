package lesson10.HomeWork;

public class Main {
    public static void main(String[] args) {

        PrintEdition[] editions = new PrintEdition[6];

        editions[0] = new Book("Война и мир", 1950, 450, "Россия", "Толстой Л.Н.");
        editions[1] = new Book("Парковка", 2020, 467, "Россия", "Нетранер");
        editions[2] = new Book("Жимолость", 2023, 157, "Россия", "ZXC");
        editions[3] = new Magazine("Мода", 2020, 58, "Россия", 1);
        editions[4] = new Magazine("Сад-огород", 2023, 190, "Россия", 3);
        editions[5] = new Magazine("Машины", 2015, 10, "Россия", 2);

        for (PrintEdition currentEdition : editions) {  // for each - сокращёный вариант for
            System.out.println(currentEdition.toString()); // проявление полиморфизм !!!
        }



    }

    public static void printBigestEdition(PrintEdition[] editions){
        // Домашка доделать
    }
}
