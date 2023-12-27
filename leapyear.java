import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=1;
        do {
            n=sc.nextInt();
            if (n%4==0){
                System.out.println("this is a leap year:"+n);
            }
            else{
                System.out.println("not a leap year");
            }
        }while (n>0);
    }
}
