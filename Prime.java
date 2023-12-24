import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        System.out.println(prime(a));
    }
    static boolean prime(int a){
        if (a<0){
          return false;
        }
        int c=2;
        while(c*c<=a){
            if (c%a==0){
                return false;
            }
            c++;

        }
        return c*c>a;
    }
}
