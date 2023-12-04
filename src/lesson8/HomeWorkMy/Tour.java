package lesson8.HomeWorkMy;

public class Tour {

    private String county;
    private int days;
    private String transfer;
    private int cost;

    public Tour() {

    }

    public Tour(String county, int days, String transfer, int cost) {
        this.county = county;
        this.days = days;
        this.transfer = transfer;
        this.cost = cost;
    }

    public Tour(String county, String transfer) {
        this.county = county;
        this.transfer = transfer;
    }

    public void printTour() {
        System.out.println("Тур в " + getCounty() + " на " + getCost() + " " + getTransfer() + " цена " + getCost());
    }


    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getTransfer() {
        return transfer;
    }

    public void setTransfer(String transfer) {
        this.transfer = transfer;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
