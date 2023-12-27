import java.util.Scanner;

public class FullPrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number");
        int a=sc.nextInt();
        int ans=FullPrime(a);
        System.out.println(ans);

    }
    static int Prime(int n){
        int count=2;
        if (n<=2){
            return 0;
        }
        while (count*count<=n){
            if (n%count==0)
            {
                return 0;
            }
            count++;
        }
        return 1;
    }
    static int FullPrime(int N){
        int rem=0;
        while (N>0){
            rem=N%10;
            if (Prime(rem)==0){
                return 0;
            }
            N=N/10;
        }
        return 1 ;
    }
}
