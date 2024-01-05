import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        System.out.println(prime(a));
    }

     static boolean prime(int a)
     {
         if (a<2){
             System.out.println("invalid");
             return false;
         }
         int count=2;
         while (count*count<=a){
             if (a%count==0){
                 return false;
             }
             count++;
         }
         return true;
    }
}
