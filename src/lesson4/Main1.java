package lesson4;

public class Main1 {
    public static void main(String[] args) {
        //Создать двумерный массив чисел и вывести его

        int[][] numbers = {{1, 2, 3},  //0
                {4, 5, 6},  //1
                {7, 8, 9},  //2
                {1, 3, 6}}; //3

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }
    }
}
