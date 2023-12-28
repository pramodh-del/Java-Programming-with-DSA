import java.util.Arrays;
import java.util.Scanner;

public class Arrayfuncton {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={1 ,2,3,4,5 };
        System.out.println(Arrays.toString(arr));
        main(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void main(int[] arr){
        arr[1]=353;

    }
}
