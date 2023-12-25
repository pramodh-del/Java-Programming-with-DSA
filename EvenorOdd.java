import java.util.Scanner;

public class EvenorOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ans=evenorodd(sc);
    }
    static int evenorodd(Scanner sc){
        System.out.println("enter your number");
        int a=sc.nextInt();
        if (a%2==0){
            System.out.println("the given number is even ");
        }
        else {
            System.out.println("the given number is odd");
        }
return a;
    }
}
