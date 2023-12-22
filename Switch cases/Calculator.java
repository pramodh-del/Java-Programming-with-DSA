import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        int num1=sc.nextInt();
        System.out.println("enter the operator");
        char operator=sc.next().trim().charAt(0);
        System.out.println("enter the second number");
        int num2=sc.nextInt();
        int result=0;
        switch (operator){
            case '+':
                result=num2+num1;
                System.out.println("addition of two numbers is: "+result);
                break;
            case '-':
                result=num2-num1;
                System.out.println("substraction of two numbers is: "+result);
                break;
            case '*':
                result=num2*num1;
                System.out.println("multiplication of two numbers is: "+result);
                break;
            default:
                System.out.println("enter the valid operator");

        }
    }
}
