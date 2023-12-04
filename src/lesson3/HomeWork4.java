package lesson3;

public class HomeWork4 {
    public static void main(String[] args) {

        String text = "Я буду учиться лучше";

        char[] simvols = text.toCharArray();

        for (int i = simvols.length-1; i >=0; i--) {

            if (i == 0) {
                System.out.print(simvols[i]);
            } else if (i > 1 & i < 6) {
                System.out.print(simvols[i]);
            } else if (i > 6 & i < 14) {
                System.out.print(simvols[i]);
            }else if (i>14){
                System.out.print(simvols[i]);
            }else {
                System.out.print("\n");
            }
        }
    }
}
