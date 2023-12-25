import java.util.Scanner;

public class mutliplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int ans=mul(a);

    }
    static int mul(int a){
        int n=1;
        for (int i = 1; i <10 ; i++) {
            n=a*i;
            System.out.println(n);
        }

        return 0;
    }
}
