import java.util.Scanner;

public class Subtractandproduct {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int ans=subandprod(a);

    }
    static int subandprod(int a){
        int sum=0;
        int product=1;
        int total=0;
        while (a>0){
            int rem=a%10;
            a=a/10;
            sum+=rem;
            product*=rem;
            total=sum-product;
        }
        System.out.println(total);
        return total;
    }
}
