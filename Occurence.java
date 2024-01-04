import java.util.Scanner;

public class Occurence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] digits={23,45,67,89};
        int n=sc.nextInt();
        for (int i = 0; i < digits.length ; i++)
        {
            if (n==digits[i]){
                System.out.println(true);
                break;
            }
            else {
                System.out.println(false);
                break;

            }

        }
    }
}
