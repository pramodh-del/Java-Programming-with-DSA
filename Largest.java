import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the numbers and to stop enter 0");
        int ans=largest(sc);
        System.out.println("the largest number is "+ans);

    }
    static int largest(Scanner sc){
        int max=0;
        while (true){
            int a=sc.nextInt();
            if (a>max){
                max=a;
            }
            if (a==0){
                break;
            }

        }return max;
    }

}
