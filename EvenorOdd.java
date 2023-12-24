import java.util.Scanner;


public class EvenorOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int b= sc.nextInt();
        int ans=evenorodd(b);
    }
    static int evenorodd(int a){
        if (a%2==0){
            System.out.println("the given number is even "+a);
        }
        else {
            System.out.println("the given number is odd"+a);
        }
        return a;
    }
}
