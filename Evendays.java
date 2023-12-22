import java.util.Scanner;

public class Evendays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the total number of days in that month");
        int day= sc.nextInt();
        for (int i = 0; i <=day ; i++) {
            if (i%2==0){
                System.out.println("kunal can go out on this "+i+" day");
            }
        }
    }
}
