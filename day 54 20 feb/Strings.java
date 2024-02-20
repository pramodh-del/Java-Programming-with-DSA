import java.util.ArrayList;
import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            System.out.print(ch);

        }
        System.out.println();
        StringBuilder sc1 = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            sc1.append(ch);
        }
        String ans=sc1.toString();
        System.out.println(ans);
        System.out.println("565"+67);
        System.out.println("56"+new ArrayList<>());
        System.out.println((char)('c'+4));
        System.out.println(7);

        String str="abcba";




    }
}

