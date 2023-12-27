//Take integer inputs till the user enters 0 and print the largest number from all.

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();

        int large=x;
        if (y>x){
            System.out.println("y is greater");
        }
    }
}
