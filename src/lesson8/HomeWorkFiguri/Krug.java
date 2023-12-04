package lesson8.HomeWorkFiguri;

public class Krug {

    private double radius;

    public Krug() {

    }

    public Krug(double radius) {
        this.radius = radius;
    }

    public static double ploshKruga(double a) {
        double s = Math.PI * (a * a);
        return s;
    }

    public static double perKruga(double a) {
        double p = 2 * Math.PI * a;
        return p;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
