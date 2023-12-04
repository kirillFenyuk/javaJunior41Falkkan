package HomeWorkFactory;

public class Main {
    public static void main(String[] args) {

        Hen hen = HenFactory.getHen("Беларусь");

        hen.getCountOfEggsPerMonth();
        System.out.println(hen.getDescription());
    }
}
