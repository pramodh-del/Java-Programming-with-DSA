import java.util.Scanner;

public class Fibbanocci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int a= sc.nextInt();
         int ans=fibbanocci(a);
    }
    static int fibbanocci(int n){
        int a=0;
        int b=1;
        int count=2;
        int temp=0;
        while (count<=n){
            temp=b;
            b=b+a;
            a=temp;
            count++;
        }
        System.out.println(b);

 return n;
    }

}