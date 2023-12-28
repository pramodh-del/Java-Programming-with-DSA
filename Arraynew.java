import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Arraynew {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] rollnos=new int[5];
        for (int i = 0; i < rollnos.length ; i++)
        {
            rollnos[i]= sc.nextInt();
        }
        for (int i = 0; i < rollnos.length ; i++)
        {
            System.out.println(rollnos[i]);
        }

        System.out.println(Arrays.toString(rollnos));

        for (int num :rollnos)
        {
            System.out.println(num+" ");
        }

        int[] pass={2,3,4,5,6};
        System.out.println(Arrays.toString(pass));
        main(pass);
        System.out.println(Arrays.toString(pass));

    }
    static void main(int[] nums){
        nums[0]=56;
    }
}
