import java.util.Arrays;
import java.util.Scanner;

public class ddarrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] nums=new int[3][4];
        for (int rows = 0; rows < nums.length; rows++) {
            for (int cols = 0; cols < nums[rows].length; cols++)
            {
                nums[rows][cols]= sc.nextInt();
            }

        }
        for (int rows = 0; rows < nums.length; rows++)
        {
            System.out.println(Arrays.toString(nums[rows]));

        }
    }
}
