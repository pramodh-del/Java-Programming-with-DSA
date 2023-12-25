import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ans= sc.nextInt();
        int a=factorial(ans);
        System.out.println("the factorial is "+a);

    }
    static int factorial(int a){
        int fact=1;
        for (int i = 1; i<=a ; i++) {
            fact=fact*i;
        }
        return fact;
    }
}
