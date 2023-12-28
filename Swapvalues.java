import java.util.Arrays;
import java.util.Scanner;

public class Swapvalues {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=23;
        int b=34;
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a+" "+b);
        int[] swap={23,45,56};
        int tempo=swap[0];
        swap[0]=swap[1];
        swap[1]=tempo;
        System.out.println(Arrays.toString(swap));
        int[] arr={34, 56 ,77,89};
        System.out.println(Arrays.toString(arr));
        swap(arr,0,2);
        System.out.println(Arrays.toString(arr));

    }
    static void swap(int[] arr ,int index ,int index2 ){
        int temp=arr[index];
        arr[index]=arr[index2];
        arr[index2]=temp;
    }
}
