///Input currency in rupees and output in USD.
import java.util.Scanner;
public class Currency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter rupee");
        int rupee=sc.nextInt();
        int dollar=rupee*85;
        System.out.println("currency in dollar is :"+dollar);
    }
}
