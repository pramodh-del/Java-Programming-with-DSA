import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter your age");
        int age= sc.nextInt();
        int ans=vote(age);

    }
    static int vote(int a)
    {
        if (a<18){
            System.out.println("not eligible for vote");
        }

        else if (a>18){
            System.out.println("you are eligible for vote "+a);
        }

        else{
            System.out.println("Invalid input");
        }
        return 0;

    }
}
