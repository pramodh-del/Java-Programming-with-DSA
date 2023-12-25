import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ans=greeting(sc);
    }

    private static String greeting(Scanner sc) {
        String input=sc.next();
        System.out.println("hello "+input);
        return input;
    }
}
