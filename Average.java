import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int average=1;
        int finalaverage=0;
        for (int i = 0; i<=n ; i++) {
            average+=i;
        }
        finalaverage=average/n;
        System.out.println("finalaverage is :"+finalaverage);
    }
}
