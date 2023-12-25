import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the year");
        int a= sc.nextInt();
        int ans=leap(a);

    }
    static int leap(int a){
        if (a%4==0){
            System.out.println("leap year");
        }
        else{
            System.out.println("not leap year");
        }
        return 0;
    }
}
