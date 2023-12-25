import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ans=sum(sc);
        System.out.println(ans);

    }
    static int sum(Scanner sc){
        int sum=0;
        while (true)
        {
            if (sc.hasNextInt())
            {
                int a=sc.nextInt();
                sum+=a;
            }
            else{
                String input=sc.next();
                if (input.equals("x")){
                    break;
                }
                else {
                    System.out.println("you have enter wrong alphabhet ");
                }
            }
        }
        return sum;
    }
}