package lesson8.HomeWorkMy;

public class Main {
    public static void main(String[] args) {

        TourAgensy tourAgensy = new TourAgensy();

        Tour tour1 = new Tour("Италия",6,"самолёт",1000);
        Tour tour2 = new Tour("Италия",4,"самолёт",800);
        Tour tour3 = new Tour("Германия",6,"автобус",550);
        Tour tour4 = new Tour("Германия",4,"самолёт",700);
        Tour tour5 = new Tour("Франция",6,"автобус",600);

        tourAgensy.addTour(tour1);
        tourAgensy.addTour(tour2);
        tourAgensy.addTour(tour3);
        tourAgensy.addTour(tour4);
        tourAgensy.addTour(tour5);

        tourAgensy.displayTours();
        tourAgensy.displayLowPriceTours();


    }
}
