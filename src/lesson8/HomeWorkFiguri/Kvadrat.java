package lesson8.HomeWorkFiguri;

public class Kvadrat {

    private int storona1;


    public Kvadrat() {

    }

    public Kvadrat(int storona1) {
        this.storona1 = storona1;
    }

    public static int ploshKvadrata(int a) {
        return a * a;
    }

    public static int perKvadrata(int a) {
        return a * 4;
    }

    public int getStorona1() {
        return storona1;
    }

    public void setStorona1(int storona1) {
        this.storona1 = storona1;
    }


}
