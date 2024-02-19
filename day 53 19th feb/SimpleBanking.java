import java.util.Scanner;

public class SimpleBanking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your Account number");
        Long accountNumber=sc.nextLong();
        System.out.println("enter your Name");
        String accountName=sc.next();


    }
    static int withdraw(int balance,int withdrewamount){
        int newBalance=balance-withdrewamount;
        return newBalance;
    }
    static int ShowBalance()
}
