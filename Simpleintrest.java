import java.util.Scanner;
public class Simpleintrest {
    public static void main(String[] args) {
        Scanner Principal=new Scanner(System.in);
        Scanner Time=new Scanner(System.in);
        Scanner Rate=new Scanner(System.in);
        int p=Principal.nextInt();
        int t=Time.nextInt();
        int r=Rate.nextInt();
        int SimpleIntrest=(p*t*r)/100;
        System.out.println("simpleintrest of given customer is :"+SimpleIntrest);
    }
}
