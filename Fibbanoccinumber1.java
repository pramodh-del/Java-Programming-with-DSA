import java.util.Scanner;
public class Fibbanoccinumber1 {
    public static void main(String[] args) {
        System.out.println("enter the nth number");
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        if (!fibbanocci(a)){
            System.out.println("no");
        }
        else {
            System.out.println("yes");
        }

    }
    static boolean fibbanocci(int n){
        int a=0;
        int b=1;
        int count=2;
        int temp=0;
        if (n<1){
            System.out.println("provide number greater then 2");
        }
        while (count<=n){
            temp=b;
            b=b+a;
            a=temp;
            if (b==n){
                return true;
            }
            count++;
        }
        return false;
    }



}
