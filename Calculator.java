import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter first number :");
        int num1=Sc.nextInt();
        System.out.println("please enter the characters + - * /");
        char operator=Sc.next().charAt(0);
        System.out.println("enter Second number");
        int num2=Sc.nextInt();
        int result=0;
        if(operator == '+'){
            result=num1+num2;
            System.out.println(result);
        } else if (operator=='-') {
            result=num1-num2;
            System.out.println(result);
        }
        else if (operator=='*') {
            result=num1*num2;
            System.out.println(result);

        } else if (operator=='/') {
            if(num1!=0||num2!=0){
                result=num1/num2;
                System.out.println(result);
            }
            else{
                System.out.println("this is an division by zero error");

            }

        }
        System.out.println("the result is "+result);
    }
}
