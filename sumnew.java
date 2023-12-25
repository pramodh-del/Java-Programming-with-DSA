import java.util.Scanner;

public class sumnew {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the numbers as much you want but when you want to exit enter 0");
        int ans=sum(sc);
        System.out.println("total sum is "+ans);

    }
    static int sum(Scanner sc){
        int sum=0;
        while (true){
            int a= sc.nextInt();
            sum+=a;
            if (a==0){
                break;
            }
        }
        return sum;
    }
}
