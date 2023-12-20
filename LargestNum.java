import java.util.Scanner;
public class LargestNum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter first number");
        int num1=input.nextInt();
        System.out.println("enter second number");
        int num2=input.nextInt();
        System.out.println("enter third number");
        int num3=input.nextInt();
        int max=num1;
        if (num2>max){
            max=num2;
        }
        if (num3>max){
            max=num3;
        }
        System.out.println("the largest number is "+max);
    }
}
