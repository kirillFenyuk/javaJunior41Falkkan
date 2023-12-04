package HomeWorkFactory;

public class HenFactory {



    public static Hen getHen(String country) {

        if (country.equalsIgnoreCase("Россия")) {
            return new RussianHen();
        } else if (country.equalsIgnoreCase("Украина")) {
            return new UkrainianHen();
        } else if (country.equalsIgnoreCase("Молдовия")) {
            return new MoldovanHen();
        } else {
            return new BelarusianHen();
        }
    }

}
