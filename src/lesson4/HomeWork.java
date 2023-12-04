package lesson4;

public class HomeWork {
    public static void main(String[] args) {

        int[][] nums = new int[8][8];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(nums[i][j]);
            }
            System.out.print("\n");
        }
    }
}
