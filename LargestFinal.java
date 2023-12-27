import java.util.Scanner;

public class LargestFinal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=0;
        int large=0;
        do {
            x=sc.nextInt();
            if (x>large){
                large=x;
            }
            System.out.println("the largest number is "+large);
        }while(x>0);

    }
}
