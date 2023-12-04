package HomeWorkFactory;

public class UkrainianHen extends Hen {

    private String country="Украина";

    private int kolEgg;

    @Override
    public void getCountOfEggsPerMonth() {
        this.kolEgg = 16;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ": " + " Моя страна: " + country + " Я несу " + kolEgg + " яиц в месяц.";
    }
}
