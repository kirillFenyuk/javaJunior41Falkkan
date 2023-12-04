package lesson8.HomeWorkMy;

public class TourAgensy {

    public Tour[] tours = new Tour[100];

    public void addTour(Tour tour) {
        for (int i = 0; i < tours.length; i++) {
            if (tours[i] == null) {
                tours[i] = tour;
                break;
            }
        }
    }

    public void displayTours() {
        for (int i = 0; i < tours.length; i++) {
            if (tours[i] != null) {
                tours[i].printTour();
            }
        }


    }

    public void displayLowPriceTours() {
        int lowPriceIndex = 0;
        for (int i = 0; i < tours.length; i++) {
            if (tours[i] == null) {
                break;
            }

            if (tours[i].getCost() < tours[lowPriceIndex].getCost()) {
                lowPriceIndex = i;
            }
        }

        System.out.println();
        System.out.println("Тур с самой низкой ценой:");
        tours[lowPriceIndex].printTour();

    }
}