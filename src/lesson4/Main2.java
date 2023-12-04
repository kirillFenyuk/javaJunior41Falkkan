package lesson4;

public class Main2 {
    public static void main(String[] args) {
        // Напечатать на консоль главную диагональ квадрата 8*8

        int[][] nums = new int[8][8];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (i + j== nums.length-1) {
                    System.out.print(nums[i][j] + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }
}
