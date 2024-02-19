import java.sql.PreparedStatement;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter first number");
        int a=sc.nextInt();
        System.out.println("enter the charcter");
        char operator=sc.next().charAt(0);
        System.out.println("enter the second number");
        int b=sc.nextInt();
        calculator(a,b,operator);

    }
    static void calculator(int a,int b,char ch){
        int result=0;
        switch (ch){
            case '+':
                result=a+b;
                System.out.println("the sum of two numbers is: "+result);
                break;
            case '-':
                result=a-b;
                System.out.println("the substraction of two numbers: "+result);
                break;
            case '/':
                result=a/b;
                System.out.println("division of two numbers are: "+result);
                break;

            case '%':
                result=a%b;
                System.out.println("remainder for two numbers is: "+result);
                break;
            case '*':
                result=a*b;
                System.out.println("product of two numbers is: "+result);
                break;
        }

    }
}
