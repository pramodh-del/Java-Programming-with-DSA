import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int x=0;
        do {
            System.out.println("enter the number");
            x=sc.nextInt();
            sum+=x;
            System.out.println("the sumis "+sum);
        }while (x>0);

    }

}
