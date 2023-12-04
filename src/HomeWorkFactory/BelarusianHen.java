package HomeWorkFactory;

public class BelarusianHen extends Hen {

    private String country="Беларусь!!!";

    private int kolEgg;

    @Override
    public void getCountOfEggsPerMonth() {
        this.kolEgg = 20;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ": " + " Моя страна: " + country + " Я несу " + kolEgg + " яиц в месяц.";
    }

}
