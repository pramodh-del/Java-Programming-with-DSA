import java.util.Scanner;

public class Twosum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ans=add(sc);
    }
    static int add(Scanner sc){
        System.out.println("enter first number");
        int num1= sc.nextInt();
        System.out.println("enter your operator");
        Character operator= sc.next().trim().charAt(0);
        System.out.println("enter your second number");
        int num2=sc.nextInt();
        int total=0;
        switch (operator){
            case '+':
                total=num1+num2;
                System.out.println("total total is "+total);
                break;
            case '-':
                total=num1-num2;
                System.out.println("total sub is "+total);
                break;
            case '*':
                total=num1*num2;
                System.out.println("total mul is "+total);
                break;
            case '/':
                total=num1/num2;
                System.out.println("total dicide is "+total);
                break;
        }

      return 0;
    }
}
