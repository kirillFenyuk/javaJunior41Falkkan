package lesson3;

public class Main5 {
    public static void main(String[] args) {

        String text = "Hello World!!!";

        char[] simbols = text.toCharArray();

        for (int i=0;i<simbols.length;i++){

            System.out.print(simbols[i]);  // строка

            System.out.println(simbols[i]);  // в линию

        }
    }
}
