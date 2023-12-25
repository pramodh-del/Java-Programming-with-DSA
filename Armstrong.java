import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int num2=sc.nextInt();

        for (int i = num; i <num2 ; i++) {
            if (armstrong(i)) {
                System.out.println(i);
            }


        }

    }

    private static boolean armstrong(int n) {
        int original=n;
        int sum=0;
        while(n>0){
            int temp=n%10;
            n=n/10;
            sum=sum+temp*temp*temp;
        }
        return sum==original;

    }
}
