//Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.
import java.util.Scanner;

public class Heavyprogram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=0;
        int even=0;
        int odd=0;
        int negative=0;
        do {
            n=sc.nextInt();
            if (n<0){
                negative+=n;
            } else if (n%2==0&&n>0) {
                even+=n;
            } else if (n%2==1&&n>0) {
               odd+=n;
            }
        }while (n!=0);
        System.out.println("sum of negative numbers is:"+negative);
        System.out.println("sum of positive even numbers is:"+even);
        System.out.println("sum of positive odd numbers is:"+odd);
    }
}
