import java.util.Scanner;

public class recurse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        print(a);
    }
    static void print(int n){
        if (n!=1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n+1);
    }
}
