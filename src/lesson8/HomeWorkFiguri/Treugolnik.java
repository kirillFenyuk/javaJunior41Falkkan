package lesson8.HomeWorkFiguri;

public class Treugolnik {

    private int storona1;
    private int storona2;
    private int storona3;

    public Treugolnik(){

    }

    public Treugolnik(int storona1,int storona2,int storona3){
        this.storona1=storona1;
        this.storona2=storona2;
        this.storona3=storona3;
    }

    public static int perimetrTriangle(int a, int b, int c) {
        return a + b + c;
    }

    public static int squareTriangle(int a, int b, int c) {

        int p = (a + b + c) / 2;

        return p;
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

    public int getStorona3() {
        return storona3;
    }

    public void setStorona3(int storona3) {
        this.storona3 = storona3;
    }
}
