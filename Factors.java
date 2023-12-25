import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int a= sc.nextInt();
        int ans=factor(a);
    }
    static int factor(int a){
        for (int i = 1; i <=a; i++) {
            if (a%i==0){
                System.out.println("these are the factors: "+i);
            }

        }
        return a;
    }

}
