package HomeWorkFactory;

public class MoldovanHen extends Hen {

    private String country="Молдовия";

    private int kolEgg;

    @Override
    public void getCountOfEggsPerMonth() {
        this.kolEgg = 10;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ": " + " Моя страна: " + country + " Я несу " + kolEgg + " яиц в месяц.";
    }
}
