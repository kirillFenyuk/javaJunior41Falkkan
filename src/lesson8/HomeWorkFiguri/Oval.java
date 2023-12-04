package lesson8.HomeWorkFiguri;

public class Oval {

    private double poluOs1;
    private double poluOs2;

    public Oval(){

    }

    public Oval(double poluOs1,double poluOs2){
        this.poluOs1=poluOs1;
        this.poluOs2=poluOs2;
    }

    public static double ploshOvala(double a,double b){
        double square = Math.PI * a * b;
        return square;
    }

    public static double perOvala(double a,double b){
        double p = (2 * Math.PI) * Math.sqrt(((a * a) + (b * b)) / 2);
        return p;
    }
    public double getPoluOs1() {
        return poluOs1;
    }

    public void setPoluOs1(double poluOs1) {
        this.poluOs1 = poluOs1;
    }

    public double getPoluOs2() {
        return poluOs2;
    }

    public void setPoluOs2(double poluOs2) {
        this.poluOs2 = poluOs2;
    }
}
