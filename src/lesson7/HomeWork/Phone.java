package lesson7.HomeWork;

public class Phone {

    private int number;
    private String model;
    private double weight;


    public Phone(){

    }
    public  Phone(int number, String model){
        this.number = number;
        this.model = model;
    }
    public  Phone(int number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public static String receiveCall(String name){
        return name;
    }



    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
