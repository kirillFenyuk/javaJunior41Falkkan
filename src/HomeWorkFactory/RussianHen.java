package HomeWorkFactory;

public class RussianHen extends Hen {

    private String country="Россия";

    private int kolEgg;


    @Override
    public void getCountOfEggsPerMonth() {
        this.kolEgg = 14;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ": " + " Моя страна: " + country + " Я несу " + kolEgg + " яиц в месяц.";
    }
}
