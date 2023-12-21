import java.util.Scanner;

public class AverageusingWhile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the n natural numbers ");
        int n=sc.nextInt();
        int sum=0;
        int average=0;
        for(int i=0;i<=n;i++){
            sum+=i;
            average=sum/n;

        }
        System.out.println("the average of total n natural numbers is :"+average);
    }
}
