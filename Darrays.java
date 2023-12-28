import java.util.Arrays;
import java.util.Scanner;

public class Darrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] list=new int[3][3];
        for (int row = 0; row < list.length ; row++)
        {
            for (int col = 0; col < list[row].length; col++)
            {
                list[row][col]= sc.nextInt();
            }
        }
        for (int row = 0; row < list.length ; row++)
        {
            System.out.println(Arrays.toString(list[row]));
        }

    }
}
