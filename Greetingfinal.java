import java.util.Scanner;

public class Greetingfinal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        String ans=name(name);

    }
    static String name(String name){
        System.out.println(" hello "+name);
        return name;
    }
}
