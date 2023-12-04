package lesson8.HomeWorkFiguri;

public class Priamougolnik {

    private int storona1;
    private int storona2;


    public Priamougolnik() {

    }

    public Priamougolnik(int storona1, int storona2) {
        this.storona1 = storona1;
        this.storona2 = storona2;

    }

    public static int ploshadPriamougolnika(int a, int b) {
        return a * b;
    }

    public static int perimetrPriamougolnika(int a, int b) {
        return (a + b) * 2;
    }


    public int getStorona1() {
        return storona1;
    }

    public void setStorona1(int storona1) {
        this.storona1 = storona1;
    }

    public int getStorona2() {
        return storona2;
    }

    public void setStorona2(int storona2) {
        this.storona2 = storona2;
    }


}
